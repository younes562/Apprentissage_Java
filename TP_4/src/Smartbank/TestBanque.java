package Smartbank;

public class TestBanque {

    public static void main(String[] args) {

        // tableau de comptes
        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("CC001", "Alice", 1500.0, 500.0);
        comptes[1] = new CompteEpargne("CE001", "Bob", 3000.0, 0.03);
        comptes[2] = new ComptePremium("CP001", "Clara", 5000.0, 2000.0);
        comptes[3] = new CompteCourant("CC002", "David", 800.0, 300.0);

        System.out.println("=== Operations ===");

        // operations sur tous les comptes
        for (int i = 0; i < comptes.length; i++) {
            comptes[i].afficher();
            comptes[i].deposer(200);
            comptes[i].retirer(100);
            System.out.println();
        }

        System.out.println("=== Comptes Epargne ===");

        // afficher seulement comptes epargne
        for (int i = 0; i < comptes.length; i++) {
            if (comptes[i] instanceof CompteEpargne) {
                CompteEpargne ce = (CompteEpargne) comptes[i];
                ce.afficher();
                ce.calculerInteret();
                System.out.println();
            }
        }
    }
}