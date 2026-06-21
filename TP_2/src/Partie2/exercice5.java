package Partie2;

import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille N du tableau : ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Les éléments du tableau sont :");
        for (int x : tab) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
