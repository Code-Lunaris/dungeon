package dungeon.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dungeon.Monster;
import dungeon.Player;
import dungeon.Room;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * This action consist to the player to attack monster chosen
 */
public class fightAction extends ActionsWithChoices<Monster>{

	/**
	 * say if they are monster in life
	 * @param current room 
	 * @return true if they are monster in live
	 */
	@Override
	public boolean isAvailable(Room room) {

		for(int i=0; i<room.getMonster().size(); i++) {
			if(!room.getMonster().get(i).isAlive())
				return false;
		}
		
		return true;
	}

	/**
	 * get a little description of the action
	 * @return description of the action
	 */
	@Override
	public String getDescription() {
		return "Attack monster";
	}

	/**
	 * attack monster chosen by the player
	 * @param current room
	 * @param player
	 */
	@Override
	public void doAction(Room room, Player player) {
		this.selectActionSubject(room).isAttack(player);
		
	}

	/**
	 * Ask to the player which monster he wants to attack
	 * @param current room
	 * @return monster who will attack
	 */
	@Override
	public Monster selectActionSubject(Room room) {
		
		System.out.println("Choose a monster");
		
		int aliveMonster =0;
		int saisie =0;
		List<Monster> listOfMonster = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<room.getMonster().size(); i++) {
			if(room.getMonster().get(i).isAlive())
				listOfMonster.add(room.getMonster().get(i));
		}
		
		do {
			
			for(int i=0; i<listOfMonster.size(); i++) 
				System.out.println(i+1+"- "+listOfMonster.get(i));
			
			saisie =sc.nextInt() -1;
			sc.nextLine();
							
		} while (saisie>=0 && saisie<listOfMonster.size());
		
		return listOfMonster.get(saisie-1);
	}
}
