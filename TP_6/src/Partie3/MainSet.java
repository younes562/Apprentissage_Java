package Partie3;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {

        HashSet<String> matieres = new HashSet<>();

        matieres.add("Math");
        matieres.add("Java");
        matieres.add("Math"); // doublon ignoré

        System.out.println(matieres);

        TreeSet<String> tri = new TreeSet<>(matieres);

        System.out.println("Trié: " + tri);
    }
}