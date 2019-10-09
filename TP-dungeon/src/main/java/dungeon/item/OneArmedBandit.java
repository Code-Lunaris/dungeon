package dungeon.item;

import java.util.ArrayList;


import dungeon.Player;

public class OneArmedBandit extends Item{
	
	int price =0;
	static final int MAX=50;
	
	public  OneArmedBandit(){
		this.price =randomNumber(100);
		this.name ="One-armed Bandit";
	}
	
	public OneArmedBandit(int p){
		this.price =p;
		this.name ="One-armed Bandit";
	}
	
	public void isUsed(Player p){

		ArrayList<Item> items =new ArrayList<Item>();
		items.add(new LifePotion());
		items.add(new StrengthPotion());
		items.add(new PurseOfGold());
		
		if(this.price<=p.getGold())
			items.get(randomNumber(3)).isUsed(p);
		
		
	}

}
