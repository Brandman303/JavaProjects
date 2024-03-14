package game.oathbringer;

import java.util.Random;

public class Driver {
	
	public static Random turn = new Random();
	
	public static void main(String[] args) {
		
		Weapon fists = new Weapon("Fists", 1.0, "Your bare fists", 1);
		Character mc = new Character("Mike", "Super weak", 2, 2, 2, 10, fists);
		Character npc = new Character("Kyle", "A strong foe", 1, 1, 1, 15, fists);
		
		while (!mc.isDead() && !npc.isDead()) {
			double whoGoes = turn.nextDouble();
			
			if (whoGoes >= 0.5) {
				npc.recordDamage(mc.doDamage());
			} else {
				mc.recordDamage(npc.doDamage());
			}
		}
		
		System.out.println(mc);
		System.out.println(npc);
		
		if (mc.isDead()) {
			System.out.println("You Died!");
		}
		if (npc.isDead()) {
			System.out.println("You Win!");
		}
	}
	
	public static void battle(Character npc, Character mc) {
		
	}

}
