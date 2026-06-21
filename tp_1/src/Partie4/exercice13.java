package Partie4;

import java.util.Scanner;

public class exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez du texte : ");
        String s = sc.nextLine();
        
        String inverse = new StringBuilder(s).reverse().toString();
        System.out.println("Texte inversé : " + inverse);
        sc.close();
    }
}