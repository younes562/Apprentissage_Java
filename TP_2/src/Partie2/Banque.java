package Partie2;
import Partie1.CompteBancaire;
public class Banque {
    private String           nom;       
    private CompteBancaire[] comptes;
    private int              nbActuels;

    public Banque(String nom, int max) {
        this.nom = nom;
        this.comptes = new CompteBancaire[max];
        this.nbActuels = 0;
    }

    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels >= comptes.length) {
            System.out.println("Impossible");
        } else {
            comptes[nbActuels++] = c;   
        }
    }

    public void afficherTous() {
        System.out.println(" Banque : " + nom);
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}

