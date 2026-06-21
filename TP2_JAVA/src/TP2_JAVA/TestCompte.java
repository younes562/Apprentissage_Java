public class TestCompte {
    public static void main(String[] args) {

        CompteBancaire c1 = new CompteBancaire();
        CompteBancaire c2 = new CompteBancaire("Ali", 1000, 500);
        CompteBancaire c3 = new CompteBancaire("Sara", 2000, 300);

        c1.afficher();
        c2.afficher();
        c3.afficher();

        // Dépôt
        c2.deposer(200);

        // Retrait
        c2.retirer(1200);

        // Virement
        c2.virementVers(c3, 200);

        // Intérêt
        c3.calculerSoldeAvecInterets();
        c3.calculerSoldeAvecInterets(0.02);

        // Affichage final
        c2.afficher();
        c3.afficher();

        // Nombre comptes
        System.out.println("Nombre total: " + CompteBancaire.getNbComptes());
    }
}
