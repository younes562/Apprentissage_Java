package Partie4;

import java.util.Scanner;

public class exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String s = sc.nextLine();
        System.out.println("La longueur est : " + s.length());
        sc.close();
    }
}
