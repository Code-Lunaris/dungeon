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
public class PlayerTest extends GameCharacterTest{
	
	@Before
	public void setupBefore() {
		player = new Player(20,5,0);
		opponent = new Player(10,5,0);
	}
}
