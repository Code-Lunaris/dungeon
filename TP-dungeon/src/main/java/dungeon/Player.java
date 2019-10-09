/**
 * 
 */
package dungeon;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * Create a GameCharacter that symbolize the player in the dungeon
 */
public class Player extends GameCharacter {
	
	

	/**
	 * Create a GameCharacter that symbolize the player in the dungeon
	 * @param lifePoints
	 * @param strengthPoints
	 * @param gold
	 * @param location
	 */
	public Player(int lifePoints, int strengthPoints, int gold, Room location) {
		super(lifePoints, strengthPoints, gold, location);
	}

	/**
	 * Create a GameCharacter that symbolize the player in the dungeon
	 * @param lifePoints
	 * @param strengthPoints
	 * @param gold
	 */
	public Player(int lifePoints, int strengthPoints, int gold) {
		super(lifePoints, strengthPoints, gold);
	}

	/**
	 * Return if the other is Player and the same condition than dungeon.GameCharacter.equals
	 * @param other Object to test
	 * @return true if other is a Player with the same attributes
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Player)) { return false;}
		return super.equals(other);
	}

	/**
	 * if the player has no more life Points left the game is over
	 */
	@Override
	public void die() {
		assert(! super.isAlive());
		System.out.print("Game Over");
	}
	
	
}
