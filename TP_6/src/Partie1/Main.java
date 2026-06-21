package Partie1;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Etudiant> list = new ArrayList<>();

        // Ajouter
        list.add(new Etudiant(1,"Ali",14));
        list.add(new Etudiant(2,"Sara",16));
        list.add(new Etudiant(3,"Younes",12));
        list.add(new Etudiant(4,"Lina",18));
        list.add(new Etudiant(5,"Omar",10));

        // Afficher
        System.out.println(list);

        // Rechercher
        for(Etudiant e : list){
            if(e.nom.equals("Sara")){
                System.out.println("Trouvé: " + e);
            }
        }

        // Supprimer par id
        list.removeIf(e -> e.id == 3);

        // Trier
        list.sort((a,b) -> Double.compare(a.moyenne,b.moyenne));

        // Meilleur étudiant
        Etudiant max = Collections.max(list, Comparator.comparing(e -> e.moyenne));
        System.out.println("Top: " + max);
    }
}