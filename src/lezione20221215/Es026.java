package lezione20221215;

import java.util.*;

public class Es026 {
  public static void main(String[] args) {
    int[] v = {1,2,3,4,5,6,7,8,9,10}; // semplice array > grandezza deve essere predefinita
    ArrayList<Integer> l1 = new ArrayList<>(); // ArrayList è un array in grado di cambiare dimensioni
    ArrayList<String> l2 = new ArrayList<>(); // ArrayList è un array in grado di cambiare dimensioni
    List<String> l3 = new ArrayList<>(); // ArrayList è un array in grado di cambiare dimensioni
    List<String> l4 = new LinkedList<>(); // ArrayList è un array in grado di cambiare dimensioni
    l1.add(5);
    l2.add("Mario");
    l2.add("Luca");
    l2.add("Giorgio");
    l2.add("Giovanni");
    l2.add("Giacomo");
    l2.set(1,"Aldo");
    l2.remove(0);
    l2.remove("Giorgio");
    l2.get(10);
    System.out.println(l2);

    Collections.sort(l2);
    System.out.println(l2);
  }
}
