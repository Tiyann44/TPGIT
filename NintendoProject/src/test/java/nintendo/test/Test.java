package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console nintendoDS = new Console("nintendoDS");
		Console Wii = new Console("Wii");
		Console Switch = new Console("Switch");
		
		Jeu jeu1 = new Jeu("Dragon Quest IX", nintendoDS);
		Jeu jeu2 = new Jeu("MarioKart", Wii);
		Jeu jeu3 = new Jeu("Super Smash Bros", Switch);
		Jeu jeu4 = new Jeu("Metroid", nintendoDS);
		Jeu jeu5 = new Jeu("Animal Crossing : New Horizon", Switch);
		
		Boutique boutique = new Boutique("Micromania"," 3 rue de Verdun");
		Client c1 = new Client("Doe","John");
		Client c2 = new Client("Doe","Jane");
		
	}

}
