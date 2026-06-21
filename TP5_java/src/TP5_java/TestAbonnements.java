package TP5_java;
public class TestAbonnements {

    public static void main(String[] args) {
    	
        Abonnement[] abonnements = new Abonnement[3];
        
        abonnements[0] = new AbonnementVideo("CinéMax", 50.0, 4, true, true);
        abonnements[1] = new AbonnementMusique("MusicPro", 30.0, 2, 25, true);
        abonnements[2] = new AbonnementJeux("GamePass", 45.0, 2, 60, 45);
        
         for (Abonnement ab : abonnements) {
            ab.afficherInfos();
            System.out.println("Coût mensuel calculé : " + ab.calculerCoutMensuel() + " DH");
            System.out.println("Score de satisfaction: " + ab.calculerScoreSatisfaction() + "/100");
        }

        
        Reducible[] reducibles = new Reducible[2];
        reducibles[0] = (Reducible)  abonnements[0];
        reducibles[1] = (Reducible) abonnements[1];

        System.out.println("\n Application d'une réduction de 20% :");
        
        for (Reducible r : reducibles) {
            System.out.println("  Eligible ? " + r.EstEligibleReduction(20));
            System.out.println("  Coût après réduction : " + r.AppliquerReduction(20) + " DH");
        }

        System.out.println( "\n  Application d'une réduction de 50% :" );
        for (Reducible r : reducibles) {
            System.out.println("  Eligible ? " + r.EstEligibleReduction(50));
            System.out.println("  Coût après réduction : " + r.AppliquerReduction(50) + " DH");
        }
    }
}