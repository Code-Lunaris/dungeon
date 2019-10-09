package dungeon;

public enum MonsterSpawnable {

	Gobelin("Gobelin",new Monster(10,2,3)),
	Orc("Orc",new Monster(20,5,10));
	
	
	
	private Monster monster = null;
	
	private String name ="";
	
	MonsterSpawnable(String name,Monster monster) {
		this.monster = monster;
		this.name = name;
	}
	
	public String ToString() {
		return this.name;
	}

	/**
	 * @return the monster
	 */
	public Monster getMonster() {
		return monster;
	}
	
}
