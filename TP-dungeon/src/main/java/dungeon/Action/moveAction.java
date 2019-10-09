package dungeon.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dungeon.Room;
import dungeon.Direction;
import dungeon.Player;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * MoveAction consist of move the player of a room to another room chosen by the player
 * 
 */
public class moveAction extends ActionsWithChoices<Direction>{

	/**
	 * say if the action is available with the element on the current room
	 * 
	 * @param current room 
	 * @return false if the room doesn't have neighbor or if they are again monster in life
	 */
	@Override
	public boolean isAvailable(Room room) {
		
		if(room.getDirection().size()==0) {
			return false;
		}
		
		for(int i=0; i<room.getMonster().size(); i++) {
			if(room.getMonster().get(i).isAlive())
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
		return "Take a direction to change room";
	}
	
	/**
	 * change the player current room
	 * @param current room
	 * @param player
	 */
	@Override
	public void doAction(Room room, Player player) {
		
		player.setLocation(room.getNeighboor(this.selectActionSubject(room)));
			
	}
	
	/**
	 * Ask to the player which room he wants to go
	 * @param current room
	 * @return the direction of the next room chosen by the player
	 */
	@Override
	public Direction selectActionSubject(Room room) {
		
		List<Direction> listOfDirection = new ArrayList<Direction>(room.getDirection());
		Scanner sc = new Scanner(System.in);
		int saisie;
		
		do {
		
		System.out.println("Choose a direction");
		
		for (int i=0; i<listOfDirection.size(); i++)
			System.out.println((i+1)+"- "+listOfDirection.get(i));
		
		saisie =sc.nextInt() -1;
		sc.nextLine();
		
		}while(saisie<=0 && saisie>listOfDirection.size());
		
		return listOfDirection.get(saisie-1);
	}

}
