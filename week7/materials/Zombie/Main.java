package week7;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int zAmbiesCount = scanner.nextInt();
		int zAmbiesHealth = scanner.nextInt();
		
		String weapon = scanner.next();
		Weapon w;
		
		switch(weapon) {
			case "axe"			: { w = new Axe(); break; }
			case "shotgun" 	: { w = new Shotgun(); break; }
			case "sword"		: { w = new AncientSword(); break; }
			case "revolver"	: { w = new Revolver(); break; }
			default : { System.out.println("Invalid weapon!"); return; }
		}
		
		Vector<Zombie> zombies = new Vector<>();
		
		for (int i = 0; i < zAmbiesCount; i++) {
			zombies.add(new CasualZombie(zAmbiesHealth));
		}
		
		int counter = 0;
		for (int i = 0; i < zombies.size(); i++) {
			Zombie current = zombies.get(i);
			while(!current.isDead()) {
				current.hit(w.hit());
				counter++;
			}
		}
		System.out.println(counter);
	}
}








