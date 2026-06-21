public class CompteBancaire {

    // Attributs
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    // Variables static
    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    // Générateur numéro simple
    private static int compteurNumero = 1;

    // Constructeur par défaut
    public CompteBancaire() {
        this.numero = compteurNumero++;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
        nbComptes++;
    }

    // Constructeur paramétré
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = compteurNumero++;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
        nbComptes++;
    }

    // GETTERS
    public String getTitulaire() { return titulaire; }
    public double getSolde() { return solde; }

    // SETTERS avec validation
    public void setTitulaire(String titulaire) {
        if (titulaire != null && titulaire != "") {
            this.titulaire = titulaire;
        }
    }

    public void setDecouvertAutorise(double d) {
        if (d >= 0) {
            this.decouvertAutorise = d;
        }
    }

    // Affichage
    public void afficher() {
        System.out.println("Compte N°: " + numero +
                " | Titulaire: " + titulaire +
                " | Solde: " + solde +
                " | Découvert: " + decouvertAutorise);
    }

    // Déposer
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    // Retirer
    public void retirer(double montant) {
        if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }

    // Virement
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }

    // Intérêt sans paramètre
    public double calculerSoldeAvecInterets() {
        solde = solde + (solde * tauxInteretAnnuel);
        return solde;
    }

    // Intérêt avec bonus
    public double calculerSoldeAvecInterets(double bonus) {
        solde = solde + (solde * (tauxInteretAnnuel + bonus));
        return solde;
    }

    // STATIC METHODS
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }
}
