package Partie4;

import java.util.Scanner;

public class exercice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String s = sc.nextLine();
        String inv = new StringBuilder(s).reverse().toString();

        if (s.equalsIgnoreCase(inv)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
        sc.close();
    }
}