package fr.ibformation.spring.bataille.batailleNavale.models;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

	private long jouerID;
	private long joueurNom;
	private List<Partie> parties = new ArrayList<>();
	private int nbPartiesGagnees;
	private Partie partieEncours;
	private Partie partieGagnees;
	private Partie partiePerdue;

	public long getJouerID() {
		return jouerID;
	}

	public void setJouerID(long jouerID) {
		this.jouerID = jouerID;
	}

	public long getJoueurNom() {
		return joueurNom;
	}

	public void setJoueurNom(long joueurNom) {
		this.joueurNom = joueurNom;
	}

	public List<Partie> getParties() {
		return parties;
	}

	public void setParties(List<Partie> parties) {
		this.parties = parties;
	}

	public int getNbPartiesGagnees() {
		return nbPartiesGagnees;
	}

	public void setNbPartiesGagnees(int nbPartiesGagnees) {
		this.nbPartiesGagnees = nbPartiesGagnees;
	}

	public Partie getPartieEncours() {
		return partieEncours;
	}

	public void setPartieEncours(Partie partieEncours) {
		this.partieEncours = partieEncours;
	}

	public Partie getPartieGagnees() {
		return partieGagnees;
	}

	public void setPartieGagnees(Partie partieGagnees) {
		this.partieGagnees = partieGagnees;
	}

	public Partie getPartiePerdue() {
		return partiePerdue;
	}

	public void setPartiePerdue(Partie partiePerdue) {
		this.partiePerdue = partiePerdue;
	}

	public void quitterPartie() {

	}

	public Partie createPartie() {

		Partie p = new Partie();
		p.open();
		this.partieEncours = p;

		return p;
	}

	public void rejoindrePartie(Partie p) {

		if (p.getJoueur1() == null) {
			this.partieEncours = p;
			p.setJoueur1(this);
		} else if (p.getJoueur2() == null) {
			this.partieEncours = p;
			p.setJoueur2(this);

		}

	}

	public void tir(int colonne, int ligne) {

		Tir tir = new Tir(colonne, ligne, this);
		System.out.println(this.partieEncours);

		partieEncours.gererTir(tir);

	}



	public void quitterPartie(Partie p) {
		
		
		
	}

}
