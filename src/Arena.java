import java.util.*;

public class Arena {

	// initialisiere einen statischen Scanner
	static public Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Monster> fighters = new ArrayList<Monster>();
		String eingabe;
		System.out.println("\nWelches Monster möchtest Du spielen:\n");
		System.out.println(" 1: Feuer   (red)");
		System.out.println(" 2: Wasser (blue)");
		System.out.print(  " 3: Grass (green) \n 1 / 2 / 3 : ");
		eingabe = myScanner.next();
		int meinDamage = (int) Math.floor(Math.random()*33+33);
		int meinLeben = (int) Math.floor(Math.random()*1000+1000);
		int deinDamage = (int) Math.floor(Math.random()*33+33);
		int deinLeben = (int) Math.floor(Math.random()*1000+1000);

		if (eingabe.equals("1")) {
			fighters.add(new FireMonster("red", meinDamage,meinLeben));
			if (Math.random() * 2 >= 1) {
				fighters.add(new GrassMonster("green", deinDamage,
						deinLeben));
			} else {
				fighters.add(new WaterMonster("blue", deinDamage,
						deinLeben));
			}
		} else if (eingabe.equals("2")) {
			fighters.add(new WaterMonster("blue", deinDamage, deinLeben));
			if (Math.random() * 2 >= 1) {
				fighters.add(new GrassMonster("green", deinDamage,
						deinLeben));
			} else {
				fighters.add(new FireMonster("red", deinDamage,
						deinLeben));
			}
		} else if (eingabe.equals("3")) {
			fighters.add(new GrassMonster("green", deinDamage, deinLeben));
			if (Math.random() * 2 >= 1) {
				fighters.add(new WaterMonster("blue", deinDamage,
						deinLeben));
			} else {
				fighters.add(new FireMonster("red", deinDamage,
						deinLeben));
			}
		} else {
			System.out.println("\nSchade! Dieses Monster gibt es nicht. Auf Wiedersehen...\n");
			System.exit(1);
		}
		Monster meinMonster = fighters.get(0);
		Monster deinMonster = fighters.get(1);
		
		System.out.print("\n");
		System.out.println("Der Kampf kann starten, " + fighters.get(0).getName());
		System.out.println("Dein Gegener ist:       " + fighters.get(1).getName() + "\n");

		while (fighters.get(0).getLife() > 0 && fighters.get(1).getLife() > 0 ) {
			deinMonster.takeHit(meinMonster);
			meinMonster.takeHit(deinMonster);
		}
		
	} // End of main()

} // End of Class
