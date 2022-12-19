package lezione20221219;

import java.util.ArrayList;
import java.util.List;

public class Es029 {
  /*
  * Crea una nuova lista ordinata di 10000 int a partire da 2 liste di int disordinate
  *
  * */
  public static List<Integer> newRandomList(){
    int n=100;
    List list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add((int) (Math.random()*n+1));
    }
    return list;
  }
  // funzione pe ordinare i numeri
  // funzione per aggiungere elementi nelle 2 stringhe
  public static void printList (List<Integer> list){
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
  public static void main(String[] args) {
    printList(newRandomList());
  }
}
