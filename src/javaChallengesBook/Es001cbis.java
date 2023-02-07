package javaChallengesBook;

import java.util.Arrays;

public class Es001cbis {

  static int[] calcSumAndCountAllNumbersDivBy_2_Or_7(int n){
    int[] result = new int[2];
    int counter = 0 ;
    int sum = 0;
    int i = 1;
    for (i = 1; i < n; i++) {
      if (i % 2 == 0 || i % 7 == 0) {
        counter++;
        sum = sum + i;
      }
    }
    /*while (i < n){
      if (i % 2 == 0 || i % 7 == 0) {
        counter++;
        sum = sum + i;
      }
      i++;
    }*/
    /*do {
      if (i % 2 == 0 || i % 7 == 0) {
        counter++;
        sum = sum + i;
      }
      i++;
    }while(i<n);*/
    result[0] = counter;
    result[1] = sum;
    //System.out.println(""+counter);
    //System.out.println(sum);
    return result;
  }

  public static void main(String[] args) {
    int n = 15;
    /*int x = calcSumAndCountAllNumbersDivBy_2_Or_7(n).length;
    for (int i = 0; i < x; i++) {
      System.out.println(calcSumAndCountAllNumbersDivBy_2_Or_7(n)[i]);
    }*/
    System.out.println("Il numero di valori divisibili per 2 o 7 è: "+calcSumAndCountAllNumbersDivBy_2_Or_7(n)[0]);
    System.out.println("la somma de valori divisibili per 2 o 7 è: "+calcSumAndCountAllNumbersDivBy_2_Or_7(n)[1]);
  }
}
