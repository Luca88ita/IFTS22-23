package lezione20221222;

import java.util.*;

public class Es030 {
  public static double testCollection(Collection c, int size){
    Random rnd = new Random();
    for (int i = 0; i < size; i++) {
      c.add(i);
    }
    long start = System.nanoTime();
    for (int i = 0; i < size; i++) {
      c.contains((rnd.nextInt(size)));
    }
    long stop = System.nanoTime();
    return ((double) (stop-start)/1000000);
  }
  public static void testList(int size){
    Random rnd = new Random();
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      l.add(i);
    }
    long start = System.nanoTime();
    for (int i = 0; i < size; i++) {
      l.contains((rnd.nextInt(size)));
    }
    long stop = System.nanoTime();
    System.out.println((double) (stop-start)/1000000);
  }
  public static void testSet(int size){
    Random rnd2 = new Random();
    Set<Integer> l2 = new HashSet<>();
    for (int i = 0; i < size; i++) {
      l2.add(i);
    }
    long start2 = System.nanoTime();
    for (int i = 0; i < size; i++) {
      l2.contains((rnd2.nextInt(size)));
    }
    long stop2 = System.nanoTime();
    System.out.println((double) (stop2-start2)/1000000);
  }
  public static void main(String[] args) {
    Set<String> hs = new HashSet<>(); // <> chiamata al costruttore // hashset è una classe che implementa le funzionalità di Set // hs è un riferimento all'oggetto (che non è ancora esplicitato)
    hs.add("Luca");
    hs.add("Fanni");
    hs.add("Tiziana");
    System.out.println(hs); // quando stampiamo perde l'ordine di inserimento perchè il suo ordine dipende dall'hash del dato che andiamo ad insrire.
    hs.remove("Tiziana"); // nel Set non ci si può riferire ad una posizione, perché i dati sono disorganizzati
    if (hs.contains("Luca")){
      System.out.println("Il set contiene Luca"); // quando stampiamo perde l'ordine di inserimento perchè il suo ordine dipende dall'hash del dato che andiamo ad insrire.
    }

    Set<String> hs2 = new TreeSet<>();
    hs2.add("Luca");
    hs2.add("Fanni");
    hs2.add("Tiziana");
    System.out.println(hs2); // quando stampiamo perde l'ordine di inserimento perchè li mette in ordine alfabetico (o nell'ordine che andremo a decidere noi)

    LinkedList<String> prova = new LinkedList<>();
    List<String> prova2 = new LinkedList<>();
    /*
    * */
    ArrayList<String> prova3 = new ArrayList<>();
    List<String> prova4 = new ArrayList<>();
    int size = 100000;
    /*************************************/
    testList(size);
    /*************************************/
    testSet(size);
    /*************************************/
    List<Integer> l = new ArrayList<>();
    Set<Integer> l2 = new HashSet<>();
    System.out.println(testCollection(l,size));
    System.out.println(testCollection(l2,size));
  }
}
