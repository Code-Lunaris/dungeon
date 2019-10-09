package dungeon.item;

import dungeon.Player;

import java.util.Random;

/**
 * @author MEUNIER Adrien, SAULQUIN Clement
 * @version 1.0
 * 
 * An item has a name and it can be use just by player.
 * Exist different type of item: LifePotion, StrengthPotion, GoldPurse and one-armed bandit
 *
 */
public abstract class Item {
	
	//Item name
	protected String name;
	
	/**
	 * Apply effect of the item
	 * @param player who use this item
	 */
	public void isUsed(Player p){}
	
	/**
	 * Return a random number between 1 and max
	 * @param maximum of the random number
	 * @return random number
	 */
	public static int randomNumber(int max){
		Random rand =new Random();
		
		return (rand.nextInt(max-1)+1);
	}
	
	public String getName() {
		return this.name;
	}

}
