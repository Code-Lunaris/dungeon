/**
 * 
 */
package dungeon;

/**
 * @author MEUNIER Adrien, SAULQUIN Clement
 * @version 1.0
 * 
 *  A GameCharacter has several attributes such as strengthPoints,lifePoints,gold.
 *  It can attack or be attack
 *
 */
public abstract class GameCharacter {

	// the amount of strengthPoints the GameCharacter has
	private int strengthPoints;
	
	// the amount of lifePoints the GameCharacter has
	private int lifePoints;
	
	// the amount of gold the GameCharacter poses
	private int gold;
	
	// the Room the GameCharacter can be found
	private Room location;
	
	protected GameCharacter(int lifePoints, int strengthPoints, int gold, Room location) {
		this.lifePoints = lifePoints;
		this.strengthPoints = strengthPoints;
		this.gold = gold;
		this.location = location;
	}
	
	protected GameCharacter(int lifePoints, int strengthPoints, int gold) {
		this.lifePoints = lifePoints;
		this.strengthPoints = strengthPoints;
		this.gold = gold;
		this.location = null;
	}
	
	public boolean isAlive() {
		return this.lifePoints > 0;
	}
	
	/**
	 * Return if the other Object has the same amount of LifePoints, StrengthPoints and Gold than this instance
	 * @param other Object to test
	 * @return true the amount is the same otherwise false
	 */
	public boolean equals(Object other) {
		if (other == null ) { return false ;}
		GameCharacter o = (GameCharacter) other;
		return (o.lifePoints == this.lifePoints) & (o.gold == this.gold) & (o.strengthPoints == this.strengthPoints);
	}
	
	/**
	 * Return the strengthPoints of the GameCharacter
	 * @return strengthPoints
	 */
	public int getStrengthPoints() {
		return this.strengthPoints;
	}
	
	/**
	 * Change to a newer value the strengthPoints
	 * @param newStrengthPoints
	 */
	public void setStrengthPoints(int newStrengthPoints) {
		this.strengthPoints = newStrengthPoints;
	}
	
	/**
	 * Return the lifePoints of the GameCharacter
	 * @return lifePoints
	 */
	public int getlifePoints() {
		return this.lifePoints;
	}
	
	/**
	 * Change to a newer value the lifePoints
	 * @param newlifePoints
	 */
	public void setLifePoints(int newlifePoints) {
		this.lifePoints = newlifePoints;
	}
	
	/**
	 * Return the gold of the GameCharacter
	 * @return gold
	 */
	public int getGold() {
		return this.gold;
	}
	
	/**
	 * Change to a newer value the gold
	 * @param newgold
	 */
	public void setGold(int newgold) {
		this.gold = newgold;
	}
	
	/**
	 * Return the location of the GameCharacter
	 * @return location
	 */
	public Room getLocation() {
		return this.location;
	}
	
	/**
	 * Change to a newer value the location
	 * @param newlocation
	 */
	public void setLocation (Room newlocation) {
		this.location = newlocation;
	}
	
	/**
	 * Decrease the amounts of LifePoints the enemy has by the amount of strengthPoints the GameCharacter has
	 * @param enemy to attack
	 */
	public void attack(GameCharacter enemy) {
		enemy.isAttack(this);
	}
	
	/**
	 * Decrease the amounts of LifePoints the GameCharacter has by the amount of strengthPoints the enemy has
	 * if the GameCharacter has no more LifePoints it used the method die()
	 * @param enemy who is attacking
	 */
	public void isAttack(GameCharacter enemy) {
		int newLifePoints = this.lifePoints - enemy.getStrengthPoints();
		this.setLifePoints(newLifePoints);
		if (newLifePoints < 0) {
			this.die();
			}
	}
	
	public void die() {}
	}

