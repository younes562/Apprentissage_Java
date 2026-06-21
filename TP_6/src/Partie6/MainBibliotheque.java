package Partie6;
import java.util.*;

public class MainBibliotheque {
    public static void main(String[] args) {

        ArrayList<Livre> livres = new ArrayList<>();
        HashSet<String> categories = new HashSet<>();
        HashMap<String,String> emprunts = new HashMap<>();

        livres.add(new Livre("1","Java","Ali",2020));
        livres.add(new Livre("2","Python","Sara",2021));

        categories.add("Informatique");
        categories.add("Science");

        emprunts.put("Younes","Java");

        // afficher livres
        for(Livre l : livres){
            System.out.println(l);
        }

        // recherche
        for(Livre l : livres){
            if(l.titre.equals("Java")){
                System.out.println("Trouvé: " + l);
            }
        }

        // supprimer
        livres.removeIf(l -> l.titre.equals("Python"));

        System.out.println("Final: " + livres);
    }
}