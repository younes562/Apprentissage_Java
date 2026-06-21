package Partie1;
public class Etudiant {
    int id;
    String nom;
    double moyenne;

    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String toString() {
        return id + " - " + nom + " - " + moyenne;
    }
}
