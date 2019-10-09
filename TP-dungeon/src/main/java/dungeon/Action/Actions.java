package dungeon.Action;
import dungeon.Room;
import dungeon.Player;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 *	An action has some effects on the player or another game character
 *  But it can't be available if the current room doesn't respect some conditions
 */
public abstract class Actions {
	
	/**
	 * say if the action is available with the element on the current room
	 * @param current room 
	 * @return true if player can do action and false if he can't
	 */
	public abstract boolean isAvailable (Room room);
	
	/**
	 * get a little description of the action
	 * @return description of the action
	 */
	public abstract String getDescription();
	
	/**
	 * apply effect of the action
	 * @param current room
	 * @param player
	 */
	public abstract void doAction(Room room, Player player);

}
