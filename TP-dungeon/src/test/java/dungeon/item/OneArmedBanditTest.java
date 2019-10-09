package dungeon.item;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import dungeon.Player;

public class OneArmedBanditTest {

	
	public int[] getPlayerStat(Player p) {
		
		int tab[] ={p.getlifePoints(), p.getStrengthPoints(), p.getGold()};
		return tab;
	}
	
	@Test
	public void OneArmedBanditIsUsedTestWhenNotEnoughMoney(){
		OneArmedBandit bandit = new OneArmedBandit(10);
		Player player = new Player(-1, -1, -1);
		int statBefore[] =this.getPlayerStat(player);
		assertTrue(Arrays.equals(statBefore, this.getPlayerStat(player)));
	}
	
	@Test
	public void OneArmedBanditIsUsedTestWhenEnoughMoney(){
		OneArmedBandit bandit = new OneArmedBandit(-1);
		Player player = new Player(10, 10, 10);
		int statBefore[] =this.getPlayerStat(player);
		bandit.isUsed(player);
		assertFalse(Arrays.equals(statBefore, this.getPlayerStat(player)));
	}
	
	

}
