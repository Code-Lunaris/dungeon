/**
 * 
 */
package dungeon;

/**
 * @author MEUNIER Adrien SAULQUIN Clement Groupe 5
 * An enum that list all of the direction possible
 */
public enum Direction {
	North,
	East,
	West,
	South;
	
	public int HashCode() {
		return this.ordinal();
	}
}
