package dungeon.item;

import static org.junit.Assert.*;
import dungeon.*;
import dungeon.item.PurseOfGold;

import org.junit.Test;

public class PurseOfGoldTest extends ItemTest{

	@Override
	public Item createItem() {
		return new PurseOfGold(10);
	}

	@Override
	public int getPlayerStat(Player p) {
		return p.getGold();
	}

}
