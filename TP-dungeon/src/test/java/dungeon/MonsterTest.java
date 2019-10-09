/**
 * 
 */
package dungeon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 *
 */
public class MonsterTest extends GameCharacterTest{
	
	@Before
	public void setupBefore() {
		player = new Monster(20,5,0);
		opponent = new Player(10,5,0);
	}
	
	
	/**
	 * Test method for {@link dungeon.Monster#isAttack(dungeon.GameCharacter)}.
	 */
	@Test
	public void testIsAttack() {
		super.testIsAttackAndSurvive();
		assertEquals(this.opponent.getlifePoints(),20 - this.player.getStrengthPoints());
		
	}
	
	/**
	 * Test method for {@link dungeon.Monster#die()}.
	 */
	@Test
	public void testDiewhenIsinRoom() {
		fail("Not yet implemented");
	}

}
