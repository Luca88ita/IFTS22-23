package lezione20221215;

import java.sql.Array;
import java.util.Arrays;

//funzione che stampi a monitor tutte le cifre di quel numero
public class Es025 {
  public static int baseDieci(int n){
    int m = n;
    int i;
    System.out.println(m+" è composto da");
    for (i = 0; m > 0; i++) {
      System.out.println(m%10+" x 10 ^"+i);
      m /= 10;
    }
    return i;
  }
  public static int dimensioneArray(int n){
    int m = n;
    int i;
    for (i = 0; m > 0; i++) {
      System.out.println(m%10+" x 10 ^"+i);
      m /= 10;
    }
    return i;
  }
  public static int[] createNewArray (int n){
    int[] array = new int[n];
    return array;
  }
  public static boolean isArmstrongNumber(int n){
    int m = n;
    int sum = 0;
    //System.out.print(" la somma dei cubi delle cifre di "+m+" è ");
    for (int i = 0; m > 0; i++) {
      //System.out.println(m%10+" x 10 ^"+i);
      m /= 10;
      sum = sum + (int) Math.pow((m%10),3);
    }
    if (sum == n){
      System.out.println(n+" è un numero di Armstrong");
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    //baseDieci(1531);
    for (int i = 1; i < 1000; i++) {
      isArmstrongNumber(i);
    }
  }
}
