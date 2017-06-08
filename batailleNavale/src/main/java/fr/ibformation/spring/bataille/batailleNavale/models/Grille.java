package fr.ibformation.spring.bataille.batailleNavale.models;

import java.util.ArrayList;
import java.util.List;

public class Grille {

	 private long idGrille;
	    private int taille = 10;
	    private List<Case> cases = new ArrayList<Case>();
	    private List<Bateau> bateaux = new ArrayList<Bateau>();

	    public Grille() {
	        super();
	        for (int x = 0; x < taille; x++) 
	        {
	            for (int y = 0; y < taille; y++) 
	            {
	                Case c = new Case(x, y);
	                c.setStatus(StatusCase.UNDISCOVERED);
	                cases.add(c);
	            }
	        }
	        ajouterbateau();
	        System.out.println("ajouter bateau");
	        
	    }

	    public int convertCoordToIndex(int x, int y) {

	        return (y * taille) + x;
	    }

	    public void ajouterbateau() {
	        Bateau b = new Bateau(2, 3, 4, TypePosition.HORIZONTAL);
	        Bateau b1 = new Bateau(2, 3, 4, TypePosition.HORIZONTAL);
	        // Si paramètre ne sont pas rentrés dans parametres Bateau ci-dessus.
	         /* b.setOrientation(HORIZONTAL);
	         * b.setTaille(4);
	         * b.setX(2); 
	         * b.setY(3);
	         */
	        System.out.println(b);
	        for (int i = 0; i < b.getTaille(); i++) {
	            
	            System.out.println("i"+i);
	            System.out.println(convertCoordToIndex(b.getAxeX() + i, b.getAxeY()));
	            Case c = cases.get(convertCoordToIndex(b.getAxeX() + i, b.getAxeY()));
	            c.setB(b);
	            c.setStatus(StatusCase.UNDISCOVERED);;
	            c.setStatus2(CaseStatus.BATEAU);;    
	        
	        }
	        bateaux.add(b);
	        bateaux.add(b1);
	    }


	    public void affichageMap() {

	        for (int y = 0; y < taille; y++) {
	            for (int x = 0; x < taille; x++) {
	                Case c = cases.get(convertCoordToIndex(x, y));

	                if (c.getB() != null) {
	                    System.out.print("B ");
	                } else  {
	                    System.out.print("- ");
	                }

	            }
	            System.out.println();
	        }

	    }
	    
	    
	    public void gererTir(Tir tir) {
	        Case ca = cases.get(convertCoordToIndex(tir.colonne, tir.ligne));
	        switch (ca.getStatus2()) {
	        case BATEAU :
	        	
	            System.out.println("tire sur de l'eau");
	            break;
	        case EAU:
	            System.out.println("tire sur un bateau" + ca.getB());
	            //ca.getB().setVie(ca.getB().getVie()-1);
	            break;
	        default:
	            break;
	            
	        }
	    }

	    public long getIdGrille() {
	        return idGrille;
	    }

	    public void setIdGrille(long idGrille) {
	        this.idGrille = idGrille;
	    }

	    public int getTaille() {
	        return taille;
	    }

	    public void setTaille(int taille) {
	        this.taille = taille;
	    }

	    public List<Case> getGrille() {
	        return cases;
	    }

	    public void setGrille(List<Case> cases) {
	        this.cases = cases;
	    }

	    public List<Bateau> getBateaux() {
	        return bateaux;
	    }

	    public void setBateaux(List<Bateau> bateaux) {
	        this.bateaux = bateaux;
	    }
	    
	    
	    @Override
	    public String toString() {
	        return "Grille [idGrille=" + idGrille + ", taille=" + taille + ", cases=" + cases + ", bateaux=" + bateaux
	                + "]";
	    }


	}