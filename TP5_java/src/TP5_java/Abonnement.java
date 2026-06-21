package TP5_java;
public abstract class Abonnement {

    private String nom;
    private double prixBase;
    private int    nbProfils;
    
    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        this.nbProfils = nbProfils;

        if (prixBase <= 0) {
            this.prixBase = 9.99;
        } else {
            this.prixBase = prixBase;
        }
    }

    public String getNom(){ 
    	return nom; 
    }
    public double getPrixBase(){
    	return prixBase; 
    }
    public int    getNbProfils(){ 
    	return nbProfils; 
    }

    
    public void setNom(String nom){
    	this.nom = nom; 
    }
    public void setPrixBase(double p){ 
    	if (p > 0) this.prixBase = p; 
    	}
    public void setNbProfils(int n){ 
    	if (n > 0) this.nbProfils = n; 
    }

    public boolean estPartageFamilial() {
    	if (nbProfils >= 3) {
    		return true ;
        } else {
        	return false ;
        }
    }

    public void afficherInfos() {
        
        System.out.println("Nom est : " + nom);
        System.out.println("Prix de base est : " + prixBase + " DH");
        System.out.println("Nb profils est  : " + nbProfils);
        if (estPartageFamilial()) {
            System.out.println("Partage familial ? Oui");
        } else {
            System.out.println("Partage familial ? Non");
        }
    }
     
    public abstract double calculerCoutMensuel();
    
    public abstract int calculerScoreSatisfaction();
}





