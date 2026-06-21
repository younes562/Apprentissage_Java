package Partie1;

public abstract class Abonnement {	
	private String nom;
	private double prixBase;
	private int nbProfils;
	
	//constructure
	public Abonnement(String nom,double prixBase,int nbProfils) {
		this.nom=nom;
		this.prixBase=prixBase;
		if(prixBase<=0) this.prixBase=100; else this.prixBase=prixBase;
		if(nbProfils<=0) this.nbProfils=1; else this.nbProfils=nbProfils;
	}
	
	//getters
	public String getNom() {
		return this.nom;
	}
	public double getPrixBase() {
		return this.prixBase;
	}
	public int getNbProfils() {
		return nbProfils;
	}
	
	//setters
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrixBase(double prixBase) {
		this.prixBase=prixBase;
	}
	public void setNbProfils(int nbProfils) {
		this.nbProfils=nbProfils;
	}
	
	//methode de partage familial
	public boolean estPartageFamilial() {
		if(this.nbProfils>=3) {
			return true;
		}else {
			return false;
		}
	}
	
	//affichage
	public void afficherInfo() {
		if(estPartageFamilial()) {
			System.out.println("l'abonement : "+this.nom+",de prix de base : "+this.prixBase
					+"et de nombre de profile : "+this.nbProfils+"(c'est une partage familial)");
		}else {
			System.out.println("l'abonement : "+this.nom+",de prix de base : "+this.prixBase +"et de nombre de profile : "+this.nbProfils);
		}
	}
	
	public abstract double calculerCoutMensuel();
	public abstract int calculerScoreSatisfaction();
}
