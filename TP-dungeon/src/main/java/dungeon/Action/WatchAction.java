package dungeon.Action;

import dungeon.Room;
import dungeon.Player;
import java.util.Iterator;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * Watch action consist to the player to wath the content of the room
 * This action is always available
 * Watching the room get all monsters, items and direction of neighbor room
 * 
 */
public class WatchAction extends Actions{
	
	/**
	 * say if the action is available with the element on the current room
	 * 
	 * @param current room 
	 * @return always true
	 */
	@Override
	public boolean isAvailable(Room room) {
		return true;
	}

	/**
	 * get a little description of the action
	 * @return description of the action
	 */
	@Override
	public String getDescription() {
		return "Watch the room";
	}

	/**
	 * display all items, monsters and direction of neighbor room
	 * @param current room
	 * @param player
	 */
	@Override
	public void doAction(Room room, Player player) {
		
		System.out.println("Is this room they are: ");
		
		System.out.println(room.getMonster().size()+" monsters");
		
		for(int i=0; i<room.getMonster().size(); i++) {
			System.out.print("- "+room.getMonster().get(i).getName());
		}
		
		System.out.println("\n"+room.getItem().size()+" items");
		
		for(int i=0; i<room.getItem().size(); i++) {
			System.out.print("- "+room.getItem().get(i).getName());
		}
		
		System.out.println("\n"+room.getDirection().size()+" directions");
		
		Iterator it =room.getDirection().iterator();
		
		while(it.hasNext()) {
			System.out.print("- "+it.next());
		}
		
	}
	
}
