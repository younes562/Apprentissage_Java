package Partie2;

import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = {10, 25, 30, 47, 52, 60, 78, 81, 95, 100};
        
        System.out.print("Entrez le nombre à rechercher : ");
        int x = sc.nextInt();
        int position = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Le nombre se trouve à la position : " + position);
        } else {
            System.out.println("Le nombre n'est pas dans le tableau.");
        }
        sc.close();
    }
}