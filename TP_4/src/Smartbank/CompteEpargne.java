package Smartbank;

public class CompteEpargne extends Compte {

    double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = solde * tauxInteret;
        solde = solde + interet;

        System.out.println("Interet ajoute : " + interet);
        System.out.println("Nouveau solde : " + solde);
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde = solde - montant;
            System.out.println("Retrait : " + montant);
        } else {
            System.out.println("Impossible de retirer");
        }
    }
}