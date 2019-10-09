/**
 * 
 */
package dungeon;

import dungeon.item.PurseOfGold;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * Create a GameCharacter that will be hostile from the player
 */
public class Monster extends GameCharacter {

	/**
	 * Create a GameCharacter that will be hostile from the player
	 * @param lifePoints
	 * @param strengthPoints
	 * @param gold
	 * @param location
	 */
	public Monster(int lifePoints, int strengthPoints, int gold, Room location) {
		super(lifePoints, strengthPoints, gold, location);
	}

	/**
	 * Create a GameCharacter that will be hostile from the player
	 * @param lifePoints
	 * @param strengthPoints
	 * @param gold
	 */
	public Monster(int lifePoints, int strengthPoints, int gold) {
		super(lifePoints, strengthPoints, gold);
	}
	
	/**
	 * Return if the other is Monster and the same condition than dungeon.GameCharacter.equals
	 * @param other Object to test
	 * @return true if other is a Monster with the same attributes
	 */
	public boolean equals(Object other) {
		if (! (other instanceof Monster)) { return false;}
		return super.equals(other);
	}
	
	/**
	 * The monster drops his gold in the Room (as a GoldPurse) when he has no more LifePoints
	 */
	public void die() {
		assert(! super.isAlive()); // the monster need to have no more lifePoints left
		if (this.getLocation() != null) {
			this.getLocation().addItem(new PurseOfGold(this.getGold()));
		}
	}
	/**
	 * if a Monster is attack and has some life left he can attack his opponent
	 * @param opponent the Gamecharacter that attack this instance
	 * 
	 */
	public void isAttack(GameCharacter opponent) {
		super.isAttack(opponent);
		if (super.isAlive()) {
			super.attack(opponent);
		}
	}

}
