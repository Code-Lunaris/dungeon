package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.Player;

public abstract class ItemTest {
	
	abstract public Item createItem();
	abstract public int getPlayerStat(Player p);
	

	@Test
	public void testIsUsed() {
		Item item = createItem();
		Player player = new Player(10, 10, 10);
		int statBefore =this.getPlayerStat(player);
		item.isUsed(player);
		assertEquals(statBefore+10, this.getPlayerStat(player));
		
	}

}
