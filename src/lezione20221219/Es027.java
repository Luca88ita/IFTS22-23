package lezione20221219;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Es027 {
  public static void main(String[] args) {
    List<String> classifica = new LinkedList<String>();
    classifica.add("Germania");
    for (int i = 0; i < 5000000; i++) {
      classifica.add(1,"Quatar");
    }
    classifica.add("Francia");
    classifica.add(0,"Argentina");
    System.out.println(classifica.get(5000002));
    System.out.println("il primo in classifica è "+classifica.get(0));
    System.out.println("il secondo in classifica è "+classifica.get(1));
    System.out.println("il secondo in classifica è "+classifica.get(1));
  }
}
