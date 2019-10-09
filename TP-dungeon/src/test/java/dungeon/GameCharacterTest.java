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
public class GameCharacterTest {
	
	protected GameCharacter player;
	protected GameCharacter opponent;
	
	@Before
	public void setupBefore() {}

	/**
	 * Test method for {@link dungeon.GameCharacter#isAlive()}.
	 */
	@Test
	public void testIsAlive() {
		assertTrue(player.isAlive());
		player.setLifePoints(0);
		assertFalse(player.isAlive());
	}

	/**
	 * Test method for {@link dungeon.GameCharacter#setStrengthPoints(int)}.
	 */
	@Test
	public void testSetStrengthPoints() {
		int new_StrengthPoints = 90;
		player.setStrengthPoints(new_StrengthPoints);
		assertEquals(player.getStrengthPoints(),new_StrengthPoints);
	}

	/**
	 * Test method for {@link dungeon.GameCharacter#setLifePoints(int)}.
	 */
	@Test
	public void testSetLifePoints() {
		int new_LifePoints = 90;
		player.setLifePoints(new_LifePoints);
		assertEquals(player.getlifePoints(),new_LifePoints);
	}

	/**
	 * Test method for {@link dungeon.GameCharacter#setGold(int)}.
	 */
	@Test
	public void testSetGold() {
		int new_gold = 90;
		player.setGold(new_gold);
		assertEquals(player.getGold(),new_gold);
	}

	/**
	 * Test method for {@link dungeon.GameCharacter#setLocation(dungeon.Room)}.
	 */
	@Test
	public void testSetLocation() {
		fail("Not yet implemented");
	}
	

	/**
	 * Test method for {@link dungeon.GameCharacter#attack(dungeon.GameCharacter)}.
	 */
	@Test
	public void testAttack() {
			this.opponent.setLifePoints(20);
			int lifeBeforeAttack = this.opponent.getlifePoints();
			assertEquals(lifeBeforeAttack,20);
			player.attack(opponent);
			assertEquals(opponent.getlifePoints(),lifeBeforeAttack - player.getStrengthPoints());
		}

	/**
	 * Test method for {@link dungeon.GameCharacter#isAttack(dungeon.GameCharacter)}.
	 */
	@Test
	public void testIsAttackAndSurvive() {
		this.player.setLifePoints(20);
		this.opponent.setLifePoints(20);
		int lifeBeforeAttack = player.getlifePoints();
		assertEquals(lifeBeforeAttack,20);
		this.opponent.setStrengthPoints(10);
		player.isAttack(opponent);
		assertEquals(player.getlifePoints(),lifeBeforeAttack - opponent.getStrengthPoints());
	}

	/**
	 * Test method for {@link dungeon.GameCharacter##die()}.
	 * when the player has life left
	 */
	@Test(expected= java.lang.AssertionError.class)
	public void testDiewhenLifeleft() {
		player.die();
	}
	
	/**
	 * Test method for {@link dungeon.GameCharacter#die()}.
	 * when the player has no more life left
	 */
	@Test
	public void testDiewhennotAlive() {
		player.setLifePoints(0);
		player.die();
	}
}
