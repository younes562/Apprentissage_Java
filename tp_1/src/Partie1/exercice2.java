package Partie1;
import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir trois nombres :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand des trois est : " + max);
        sc.close();
    }
}


