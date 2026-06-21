package Partie1;
import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la valeur de N : ");
        int n = sc.nextInt();
        
        int somme = 0;
        int i = 1;
        while (i <= n) {
            somme += i;
            i++;
        }
        
        System.out.println("La somme des " + n + " premiers entiers est : " + somme);
        sc.close();
    }
}
