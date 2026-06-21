package Partie3;

import java.util.Scanner;

public class exercice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lignes : "); int L = sc.nextInt();
        System.out.print("Colonnes : "); int C = sc.nextInt();
        int[][] mat = new int[L][C];
        int[][] trans = new int[C][L];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Matrice transposée :");
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < L; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
