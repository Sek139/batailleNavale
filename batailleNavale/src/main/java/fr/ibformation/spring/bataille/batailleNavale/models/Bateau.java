package fr.ibformation.spring.bataille.batailleNavale.models;

import java.util.List;

public class Bateau {

	
	private long bateauID;
	private int taille;
	private int AxeX;
	private int AxeY;
	TypeCase statut;
	TypePosition position;
	
	


	
	public Bateau(int taille, int axeX, int axeY, TypePosition position) {
		super();
		this.taille = taille;
		AxeX = axeX;
		AxeY = axeY;
		this.position = position;
	}
	public TypePosition getPosition() {
		return position;
	}
	public void setPosition(TypePosition position) {
		this.position = position;
	}
	List<Grille> grilles;

	public long getBateauID() {
		return bateauID;
	}
	public void setBateauID(long bateauID) {
		this.bateauID = bateauID;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getAxeX() {
		return AxeX;
	}
	public void setAxeX(int axeX) {
		AxeX = axeX;
	}
	public int getAxeY() {
		return AxeY;
	}
	public void setAxeY(int axeY) {
		AxeY = axeY;
	}
	public TypeCase getStatut() {
		return statut;
	}
	public void setStatut(TypeCase statut) {
		this.statut = statut;
	}
	public List<Grille> getGrilles() {
		return grilles;
	}
	public void setGrilles(List<Grille> grilles) {
		this.grilles = grilles;
	}
	
	@Override
	public String toString() {
		return "Bateau [bateauID=" + bateauID + ", taille=" + taille + ", AxeX=" + AxeX + ", AxeY=" + AxeY + ", statut="
				+ statut + ", position=" + position + ", grilles=" + grilles + "]";
	}
	/*
	public Bateau(Coordonnee debut, int longueur, boolean estVertical) {
		this.debut = debut;

		if (estVertical) {

			fin = new Coordonnee(debut.getColonne(), debut.getLigne() + longueur - 1);

		} else {

			fin = new Coordonnee(debut.getColonne() + longueur - 1, debut.getLigne());

		}

		partieTouchees = new Coordonnee[longueur];
		nbtouchees = 0;

	}

	public Coordonnee getDebut() {
		return debut;
	}

	public void setDebut(Coordonnee debut) {
		this.debut = debut;
	}

	public Coordonnee getFin() {
		return fin;
	}

	public void setFin(Coordonnee fin) {
		this.fin = fin;
	}

	public boolean contient(Coordonnee c) {

		return c.getColonne() >= debut.getColonne() && c.getColonne() <= fin.getColonne()
				&& c.getLigne() >= debut.getLigne() && c.getLigne() <= fin.getLigne();

	}

	public boolean estTouche(Coordonnee c) {

		for (int i = 0; i < partieTouchees.length; i++) {
			if (partieTouchees[i].equals(c)) {
				return true;
			}
		}
		return false;

	}

	public boolean recoitTir(Coordonnee c) {
		if (this.contient(c)) {
			partieTouchees[nbtouchees] = c;
			nbtouchees = nbtouchees + 1;
			return true;
		}

		return false;
	}

	public boolean estTouche() {
		return nbtouchees > 0;
	}

	public boolean estCoule() {

		return partieTouchees.length == nbtouchees;
	}

	public boolean chevauche(Bateau p) {

		if (this.debut.getLigne() == this.fin.getLigne()) {

			return p.debut.getColonne() >= this.debut.getColonne() && p.debut.getColonne() <= this.fin.getColonne()
					&& this.debut.getLigne() >= p.debut.getColonne() && this.debut.getLigne() <= p.fin.getLigne();
		} else {

			return p.debut.getLigne() >= this.debut.getLigne() && p.debut.getLigne() <= this.fin.getLigne()
					&& this.getDebut().getColonne() >= p.debut.getColonne()
					&& this.debut.getColonne() <= p.fin.getColonne();

		}
*/
	
	
	
}
