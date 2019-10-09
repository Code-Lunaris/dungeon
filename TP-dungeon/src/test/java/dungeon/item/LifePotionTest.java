package dungeon.item;

import static org.junit.Assert.*;

import dungeon.*;
import dungeon.item.LifePotion;

import org.junit.Test;

public class LifePotionTest extends ItemTest{

	/**
	 * Method who test the proper functionning of isUsed(Player p)
	 */
	/*@Test
	public void testIsUsed() {
		LifePotion potion = new LifePotion(10);
		Player player = new Player(10, 10, 10);
		int lifePlayerBefore =player.getlifePoints();
		potion.isUsed(player);
		assertEquals(10+lifePlayerBefore, player.getlifePoints());
	}*/

	@Override
	public Item createItem() {
		return new LifePotion(10);
	}

	@Override
	public int getPlayerStat(Player p) {
		return p.getlifePoints();
	}

}
