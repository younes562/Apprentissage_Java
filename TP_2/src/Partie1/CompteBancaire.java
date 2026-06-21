package Partie1;
public class CompteBancaire {
    private int numero;
    private String titulaire;
    private double solde;
    static int    nbComptes = 0;        
    static double taux      = 0.03;    
    private double decouvertAutorise;

// 4 :
public CompteBancaire() {
    this.numero = nbComptes;
    this.titulaire = "NULL";    
    this.decouvertAutorise = 0.0;
    this.solde  = 0.0;
    nbComptes++;
}
 // 5 :
public CompteBancaire(String titulaire, double soldeI, double decouvertAutorise) {
    this.titulaire = titulaire;
    this.solde  = soldeI;
    this.decouvertAutorise = decouvertAutorise;
    this.numero  = nbComptes;
    nbComptes++;
}

// 6 :
public void setTitulaire(String T) {
    if (T != null)              
        this.titulaire = T;
}

public String getTitulaire() {
    return this.titulaire;
}

public void setDecouvertAutorise(double DA) {
    if (DA >= 0)              
        this.decouvertAutorise = DA;
}

public double getDecouvertAutorise() {
    return this.decouvertAutorise;  
}

// 7 :
public void afficher() {
    System.out.println(
        "numero : "    + this.numero     +
        " titulaire : " + this.titulaire  +   
        " solde : "    + this.solde
    );
}

// 8 :
public void deposer(double montant) {
    if (montant > 0)
        this.solde = this.solde + montant;
    else
        System.out.println("Montant de dépôt invalide");
}

public void retirer(double montant) {
    if (montant > 0 && montant <= this.solde + this.decouvertAutorise) {  
        solde = solde - montant;
        System.out.println("Retirer : " + montant);   
    } else {
        System.out.println("Retrait refusé");
    }
}

public void virementVers(CompteBancaire autre, double montant) {
    if (montant > 0 && this.solde >= montant) {
        this.solde  = this.solde - montant;
        autre.solde += montant;         
        System.out.println("Montant Transféré est : " + montant);
    } else {
        System.out.println("Impossible");
    }
}

// 9 :
public double calculerSoldeAvecInterets() {         
    return solde + solde * taux;
}

public double calculerSoldeAvecInterets(double bonus) { 
    double B = solde * (taux + bonus);
    return solde + B;
}
// 10 : 

public int getNbComptes() {
    return nbComptes;
}

public double getTaux() {
    return taux;
}


}
