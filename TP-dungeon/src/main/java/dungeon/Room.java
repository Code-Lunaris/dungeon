package dungeon;

import java.util.*;

import dungeon.item.*;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 *	A room of a dungeon can have some Monsters and Item and is linked with other Room
 */
public class Room {
	
	// List of Monster present in the Room
	private List<Monster> monsters;
	
	// List of Item lying on the floor
	private  List<Item> items;
	
	// Map of all the direction available
	private Map<Direction,Room> neighbors;
	
	/**
	 * Create a Room with no Monster, no Item, and no Room linked
	 * 
	 */
	public Room() {
		this.monsters = new ArrayList<Monster>();
		this.items = new ArrayList<Item>();
		this.neighbors = new HashMap<Direction,Room>();		
	}
	
	public boolean equals(Object other) {
		if ( other == null | !(other instanceof Room )) {
			return false;
		}
		Room o = (Room) other;
		return (this.items == o.items) && (this.monsters == o.monsters) && (this.neighbors == o.neighbors);
	} 
	
	/**
	 * Add a Monster to the List of Monster in the Room
	 * @param monster to add
	 */
	public void addMonster(Monster monster) {
		this.monsters.add(monster);
	}
	
	/**
	 * Add a Item to the List of Item in the Room
	 * @param item to add
	 */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/**
	 * Add a neighbor to the Room with a direction of the linked
	 * @param direction of the link
	 * @param neighbor Room to link
	 * 
	 * @throws IllegalStateException when the direction is already used
	 */
	public void addNeighboors(Direction direction, Room neighbor) throws IllegalStateException {
		if (this.neighbors.containsKey(direction)) { throw new IllegalStateException("Direction already used"); }
		this.neighbors.put(direction, neighbor);
	}
	
	/**
	 * Return all the Monster of the Room
	 * @return List<Monster> 
	 */
	public List<Monster> getMonster() {
		return this.monsters;
	}
	
	/**
	 * Return all the Item of the Room
	 * @return List<Item>
	 */
	public List<Item> getItem() {
		return this.items;
	}
	
	/**
	 * Return all the direction used
	 * @return Set<Direction>
	 */
	public Set<Direction> getDirection() {
		return this.neighbors.keySet();
	}
	
	/**
	 * Return the Room linked the direction choosed
	 * @param direction 
	 * @return Room that linked by the direction
	 */
	public Room getNeighboor(Direction direction) {
		if (this.neighbors.containsKey(direction)) { return null; }
		return this.neighbors.get(direction);
	}
	
	/**
	 * Return if the Room is the End of the dungeon
	 * @return false all the Room are not Exit
	 */
	public boolean isExit() {
		return false;
	}
	
}
