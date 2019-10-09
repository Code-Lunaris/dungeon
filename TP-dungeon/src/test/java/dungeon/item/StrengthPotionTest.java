package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.*;
import dungeon.item.StrengthPotion;

public class StrengthPotionTest extends ItemTest{

	@Override
	public Item createItem() {
		return new StrengthPotion(10);
	}

	@Override
	public int getPlayerStat(Player p) {
		return p.getStrengthPoints();
	}

	/**
	 * Method who test the proper functionning of isUsed(Player p)
	 */
	/*@Test
	public void testIsUsed() {

		StrengthPotion potion = new StrengthPotion(10);
		dungeon.Player player = new Player(0, 0, 0);
		int playerStrengthBefore =player.getStrengthPoints();
		potion.isUsed(player);
		assertEquals(10+playerStrengthBefore, player.getStrengthPoints());
	}*/
	
	

}
