package Partie2;
import java.util.*;

public class Main{
    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        file.add(new Client(1,"Ali"));
        file.add(new Client(2,"Sara"));

        System.out.println(file);

        // servir premier
        file.poll();

        // ajouter fin
        file.addLast(new Client(3,"Younes"));

        // tête
        System.out.println("Premier: " + file.peek());
    }
}
