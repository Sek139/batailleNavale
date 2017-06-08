package fr.ibformation.spring.bataille.batailleNavale.models;

public class Tir {
int colonne;
int ligne;
Joueur joueurTireur;
Tir tir;

public Tir(int colonne, int ligne, Joueur joueurTireur) {
	super();
	this.colonne = colonne;
	this.ligne = ligne;
	this.joueurTireur = joueurTireur;
}
public int getColonne() {
	return colonne;
}
public void setColonne(int colonne) {
	this.colonne = colonne;
}
public int getLigne() {
	return ligne;
}
public void setLigne(int ligne) {
	this.ligne = ligne;
}
public Joueur getJoueurTireur() {
	return joueurTireur;
}
public void setJoueurTireur(Joueur joueurTireur) {
	this.joueurTireur = joueurTireur;
}
}
