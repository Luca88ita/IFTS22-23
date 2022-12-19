package lezione20221219;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Es028 {
  /*
   * Creare un array/linked list di string
   * popolarlo di parole random ("persona"+i)
   * Stampare la lista utilizzando il for ed accedendo agli elementi con lista.get(i)
   * L'array grande a sufficienza da notare latenza
   * */
  public static void main(String[] args) {
    //List<String> listaArray = new ArrayList<String>(); // molto più veloce per questo tipo di esercizio
    List<String> listaArray = new LinkedList<String>(); // molto più lento per questo tipo di esercizio
    boolean isLinked=true;
    Date date= new Date();
    long start = System.nanoTime();
    long max_i = 100000;
    for (int i = 0; i < max_i; i++) {
      listaArray.add(i,"Persona"+(i+1));
    }
    if (isLinked){
      for(String s:listaArray){
        System.out.println(s);
      }
    }else{
      for (int i = 0; i < max_i; i++) {
        System.out.println(listaArray.get(i));
      }
    }
    long stop = System.nanoTime();
    System.out.println("Tempo necessario in ns (1/1.000.000.000 s): "+(stop-start));
  }
}
