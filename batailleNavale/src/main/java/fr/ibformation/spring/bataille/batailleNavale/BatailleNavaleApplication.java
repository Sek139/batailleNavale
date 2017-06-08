package fr.ibformation.spring.bataille.batailleNavale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.ibformation.spring.bataille.batailleNavale.models.Joueur;
import fr.ibformation.spring.bataille.batailleNavale.models.Partie;

@SpringBootApplication
public class BatailleNavaleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BatailleNavaleApplication.class, args);

		Joueur j1 = new Joueur();
		Partie p = j1.createPartie();

		Joueur j2 = new Joueur();

		j1.rejoindrePartie(p);
		j2.rejoindrePartie(p);

		
	
		
		p.getMap1().affichageMap();;
		System.out.println();
		p.getMap2().affichageMap();
		
	

		// Bateau n1 = new Bateau(new Coordonnee("B1"), 3, false);
		// System.out.println("Bateau 1 debut :" + n1.getDebut());
		// System.out.println("Bateau 1 debut :" + n1.getFin());

	}
}
