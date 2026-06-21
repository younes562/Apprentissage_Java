package Partie6;

public class Livre {
    String isbn, titre, auteur;
    int annee;

    public Livre(String isbn, String titre, String auteur, int annee){
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String toString(){
        return titre + " (" + auteur + ")";
    }
}