package Smartbank;

public class CompteCourant extends Compte {

    double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    public void retirer(double montant) {

        if (montant <= solde + decouvertAutorise) {
            solde = solde - montant;
            System.out.println("Retrait : " + montant);
            System.out.println("Solde : " + solde);
        } else {
            System.out.println("Retrait impossible");
        }
    }

    public void afficher() {
        super.afficher();
        System.out.println("Decouvert : " + decouvertAutorise);
    }
}