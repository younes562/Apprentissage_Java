package Partie3;

import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrice["+i+"]["+j+"] = ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Affichage de la matrice :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}