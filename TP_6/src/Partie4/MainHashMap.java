package Partie4;
import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notes = new HashMap<>();

        notes.put("Ali",14.0);
        notes.put("Sara",16.5);
        notes.put("Younes",12.0);

        System.out.println(notes);

        // rechercher
        System.out.println("Note Sara: " + notes.get("Sara"));

        // modifier
        notes.put("Ali",15.0);

        // supprimer
        notes.remove("Younes");

        // moyenne
        double sum = 0;
        for(double n : notes.values()){
            sum += n;
        }

        System.out.println("Moyenne: " + sum/notes.size());
    }
}
