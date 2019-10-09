package dungeon.item;

import dungeon.*;

/**
 * @author MEUNIER Adrien, SAULQUIN Clement
 * @version 1.0
 * 
 * LifePotion is an item who give more life to a player
 *
 */
public class LifePotion extends Item {
	
	//life point gived by the potion
	int lifePoint =0;
	
	public LifePotion(int l){
		this.lifePoint =l;
		this.name ="Life potion";
	}
	
	public LifePotion(){
		this.lifePoint =randomNumber(100);
		this.name ="Life potion";
	}
	
	/**
	 * Give life to Palyer p
	 * @param Payer who use this potion
	 */
	public void isUsed(Player p){
		p.setLifePoints(this.lifePoint+p.getlifePoints());
	}
	

}
