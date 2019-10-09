package dungeon.item;

import dungeon.Player;

/**
 * @author MEUNIER Adrien, SAULQUIN Clement
 * @version 1.0
 * 
 * StrenghtPotion is an item who give more strength to a player
 *
 */
public class StrengthPotion extends Item {
	
	// Strength give by this potion
	private int strength;
	
	
	public StrengthPotion(int s){
		this.strength =s;
		this.name ="Strength Potion";
	}
	
	public StrengthPotion(){
		this.strength =randomNumber(100);
		this.name ="Strength Potion";
	}
	
	/**
	 * Give strength to Palyer p
	 * @param Payer who use this potion
	 */
	public void isUsed(Player p){
		p.setStrengthPoints(this.strength+p.getStrengthPoints());
	}

}
