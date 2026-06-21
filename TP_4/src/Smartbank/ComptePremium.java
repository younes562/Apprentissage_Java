package Smartbank;

public class ComptePremium extends Compte {

    double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    public void retirer(double montant) {

        if (montant <= plafondRetrait && montant <= solde) {
            solde = solde - montant;
            System.out.println("Retrait effectué : " + montant);
            System.out.println("Nouveau solde : " + solde);
        } else {
            System.out.println("Retrait impossible");
        }
    }
}