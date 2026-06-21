package Partie2;

public class Client {
    int numero;
    String nom;

    public Client(int numero, String nom){
        this.numero = numero;
        this.nom = nom;
    }

    public String toString(){
        return numero + " - " + nom;
    }
}
