package Partie3;
import Partie1.CompteBancaire;
import Partie2.Banque;
public class TestBanque {

    public static void main(String[] args) {

        // 1
        Banque banque = new Banque("MarocBank", 1500);

        // 2  
        CompteBancaire c1 = new CompteBancaire("Alice",   2000.0, 500.0);
        CompteBancaire c2 = new CompteBancaire("Bob",     1500.0, 300.0);
        CompteBancaire c3 = new CompteBancaire("Charlie", 1000.0, 200.0);

        // 3
        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);
        banque.ajouterCompte(c3);

        // 4 
        c1.deposer(500.0);
        c1.retirer(200.0);
        c2.virementVers(c3, 400.0);

        // 5
        banque.afficherTous();

        // 6
        System.out.println("Solde avec intérêts (c2) : "
            + c2.calculerSoldeAvecInterets());
        System.out.println("Solde avec intérêts + bonus (c2) : "
            + c2.calculerSoldeAvecInterets(0.015));

        // 7
        System.out.println("Nombre total de comptes créés : "
            + c1.getNbComptes());
        System.out.println("Taux d'intérêt annuel : "
            + c1.getTaux());
    }
}