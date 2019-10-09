package dungeon.item;

import dungeon.Player;

public class PurseOfGold extends Item{
	
	int gold =0;
	
	public PurseOfGold(int g){
		this.gold =g;
		this.name ="Purse of gold";
	}
	
	public PurseOfGold(){
		this.gold=randomNumber(100);
		this.name ="Purse of gold";
	}
	
	/**
	 * Add gol to the gold player
	 * @param Payer who use this item
	 */
	public void isUsed(Player p){
		p.setGold(p.getGold()+this.gold);
	}

}
