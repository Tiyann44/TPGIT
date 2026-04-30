package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse adresse1 = new Adresse("67", "rue des capucines", "Blancherive");
		Adresse adresse2 = new Adresse("23", "avenue de l'avenue", "Orgrimmar");
		
		Boutique boutique1 = new Boutique("MicroMania", adresse1);
		Boutique boutique2 = new Boutique("FNAC", adresse2);
		
		Portable nintendoDS = new Portable("nintendoDS", 200, "1996");
		Salon Wii = new Salon ("Wii", 00, "1996");
		Hybride Switch = new Hybride("Switch", 200, "1996");
		
		Jeu jeu1 = new Jeu("Dragon Quest IX", nintendoDS, boutique1);
		Jeu jeu2 = new Jeu("MarioKart", Wii, boutique1);
		Jeu jeu3 = new Jeu("Super Smash Bros", Switch, boutique1);
		Jeu jeu4 = new Jeu("Metroid", nintendoDS, boutique1);
		Jeu jeu5 = new Jeu("Animal Crossing : New Horizon", Switch, boutique1);
		
		Achat achat1 = new Achat(jeu1, LocalDate.now(), 20);
		Achat achat2 = new Achat(jeu3, LocalDate.now(), 40);
		Achat achat3 = new Achat(jeu5, LocalDate.now(), 1000);
		
		
		List<Achat> achatsJhon = new ArrayList<>();
		achatsJhon.add(achat1);
		achatsJhon.add(achat2);
		
		List<Achat> achatsJordan = new ArrayList<>();
		achatsJhon.add(achat1);
		achatsJhon.add(achat3);
		
		Boutique boutique = new Boutique("Micromania",adresse1);
		Client c1 = new Client("Doe","John", achatsJhon);
		Client c2 = new Client("Abid","Jordan", achatsJordan);
		
		
	}

}
