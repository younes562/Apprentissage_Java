package Partie4;

import Parite1.Abonnement;
import Partie2.AbonnementJeux;
import Partie2.AbonnementMusique;
import Partie2.AbonnementVideo;
import Partie3.Reducible;

public class TestAbonnement {
    public static void main(String[] args) {
        //Tableau d'abonnements
        Abonnement[] abonnements = {
            new AbonnementVideo("brahim", 100, 4, true, true),
            new AbonnementMusique("mohamed", 50, 2, 25, true),
            new AbonnementJeux("ahmed", 120, 3, 60, 45)
        };
        // Affichage
        for (int i = 0; i < abonnements.length; i++) {
            Abonnement a = abonnements[i];
            System.out.println("\n--- Abonnement ---");
            a.afficherInfo();
            System.out.println("Coût mensuel: " + a.calculerCoutMensuel() + " DH");
            System.out.println("Score satisfaction: " + a.calculerScoreSatisfaction());
        }
        // Tableau Reducible
        Reducible[] reducibles = {
            (Reducible) abonnements[0],
            (Reducible) abonnements[1]
        };
        //Test réduction
        for (int i = 0; i < reducibles.length; i++) {
            Reducible r = reducibles[i];
            System.out.println("--- 20% ---");
            System.out.println("Coût après réduction: " + r.AppliquerReduction(20));

            System.out.println("--- 50% ---");
            if (r.EstEligibleReduction(50)) {
                System.out.println("Coût après réduction: " + r.AppliquerReduction(50));
            } else {
                System.out.println("Réduction refusée !");
            }
        }
    }
}

