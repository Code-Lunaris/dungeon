package dungeon.Action;

import dungeon.Room;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 *	Some actions needs to make a choice between different option
 */
public abstract class ActionsWithChoices<T> extends Actions{
	
	/**
	 * select the subject of the action
	 * @param current room
	 * @return
	 */
	public abstract T selectActionSubject(Room room);
}
