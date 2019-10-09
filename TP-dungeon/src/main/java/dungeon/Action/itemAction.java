package dungeon.Action;

import java.util.Scanner;

import dungeon.Player;
import dungeon.Room;
import dungeon.item.*;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 *	This action consist to player to select and use item in room
 */
public class itemAction extends ActionsWithChoices<Item>{

	/**
	 * say if they are item in the current room
	 * @param current room 
	 * @return true if they are item
	 */
	@Override
	public boolean isAvailable(Room room) {
		return room.getItem().size()>0;
	}

	/**
	 * get a little description of the action
	 * @return description of the action
	 */
	@Override
	public String getDescription() {
		return "Drop and use an item";
	}

	/**
	 * use item chosen by the player
	 * @param current room
	 * @param player
	 */
	@Override
	public void doAction(Room room, Player player) {
		selectActionSubject(room).isUsed(player);
	}

	/**
	 * Ask to the player which item he wants to us
	 * @param current room
	 * @return monster who will attack
	 */
	@Override
	public Item selectActionSubject(Room room) {

			int saisie;
			Scanner sc = new Scanner(System.in);
			
			do {
				
				for(int i=0; i<room.getItem().size(); i++) {
					System.out.println(i+1+"- "+room.getItem().get(i));
				}
				saisie =sc.nextInt() -1 ;
				sc.nextLine();
				
			}while(saisie>=0 && saisie<room.getItem().size());
			
			return room.getItem().get(saisie);
			
	}

}
