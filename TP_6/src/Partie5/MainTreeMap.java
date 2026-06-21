package Partie5;
import java.util.*;

public class MainTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(101,"Ali");
        map.put(50,"Sara");
        map.put(150,"Younes");

        System.out.println(map);

        System.out.println("Premier: " + map.firstEntry());
        System.out.println("Dernier: " + map.lastEntry());

        // >100
        System.out.println(map.tailMap(100));
    }
}
