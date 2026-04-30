package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse adresse1 = new Adresse("67", "rue des capucines", "Blancherive");
		Adresse adresse2 = new Adresse("23", "avenue de l'avenue", "Orgrimmar");
		
		Boutique boutique = new Boutique("MicroMania", adresse1);
		Boutique boutique = new Boutique("FNAC", adresse2)
		
		Console nintendoDS = new Console("nintendoDS");
		Console Wii = new Console("Wii");
		Console Switch = new Console("Switch");
		
		Jeu jeu1 = new Jeu("Dragon Quest IX", nintendoDS);
		Jeu jeu2 = new Jeu("MarioKart", Wii);
		Jeu jeu3 = new Jeu("Super Smash Bros", Switch);
		Jeu jeu4 = new Jeu("Metroid", nintendoDS);
		Jeu jeu5 = new Jeu("Animal Crossing : New Horizon", Switch);
		
		List<Jeu> achatsJhon = new ArrayList<>();
		achatsJhon.add(jeu1);
		achatsJhon.add(jeu3);
		
		List<Jeu> achatsJordan = new ArrayList<>();
		achatsJhon.add(jeu2);
		achatsJhon.add(jeu5);
		
		Boutique boutique = new Boutique("Micromania"," 3 rue de Verdun");
		Client c1 = new Client("Doe","John");
		Client c2 = new Client("Abid","Jordan");
		
		
	}

}
