package fr.ibformation.spring.bataille.batailleNavale.models;

import javax.persistence.Entity;

;

@Entity
public class Partie {

	private Long partieID;
	private Joueur joueur1;
	private Joueur joueur2;
	private Joueur JoueurEncours;
	private int nbTours = 60;
	private int tourEncours = 0;
	private Statut statut;
	private String gagnant;
	private Grille map1;
	private Grille map2;

	
	
	
	
	
	

	public Joueur getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
		this.start();
	}

	public int getNbTours() {
		return nbTours;
	}

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}

	public int getTourEncours() {
		return tourEncours;
	}

	public void setTourEncours(int tourEncours) {
		this.tourEncours = tourEncours;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public String getGagnant() {
		return gagnant;
	}

	public void setGagnant(String gagnant) {
		this.gagnant = gagnant;
	}

	public void start() {
		map1 = new Grille();
		map2 = new Grille();

		this.setJoueurEncours(joueur1);
		this.statut = Statut.ENCOURS;
		System.out.println(this.statut);
	}

	public void open() {
		this.statut = Statut.OUVERTE;
		System.out.println(this.statut);
	}

	public void end() {
		this.statut = Statut.TERMINE;
		System.out.println(this.statut);
	}

	public void gererTir(Tir tir) {
		// code qui fqit evoluer la partie et on renvoie la map qui va bien

		if (this.getStatut() == (Statut.ENCOURS)) {
			if (this.getJoueurEncours().equals(this.joueur1)) {
				this.getMap2().gererTir(tir);
				this.setJoueurEncours(this.joueur2);
			} else if (JoueurEncours == joueur2) {
				this.getMap1().gererTir(tir);
				JoueurEncours = joueur1;

			}

		}
	}

	public Long getPartieID() {
		return partieID;
	}

	public void setPartieID(Long partieID) {
		this.partieID = partieID;
	}

	public Joueur getJoueurEncours() {
		return JoueurEncours;
	}

	public void setJoueurEncours(Joueur joueurEncours) {
		JoueurEncours = joueurEncours;
	}

	public Grille getMap1() {
		return map1;
	}

	public void setMap1(Grille map1) {
		this.map1 = map1;
	}

	public Grille getMap2() {
		return map2;
	}

	public void setMap2(Grille map2) {
		this.map2 = map2;
	}

	public void demarrerPartie() {

	}
	@Override
	public String toString() {
		return "Partie [partieID=" + partieID + ", joueur1=" + joueur1.getJouerID() + ", joueur2=" + joueur2.getJouerID() + ", JoueurEncours="
				+ JoueurEncours+ ", nbTours=" + nbTours + ", tourEncours=" + tourEncours + ", statut=" + statut
				+ ", gagnant=" + gagnant + ", map1=" + map1 + ", map2=" + map2 + "]";
	}
}
