package javaChallengesBook;
/*
 * By definition, a natural number is called a perfect number if its value is equal to the sum
 * of its real divisors. This is true, for example, for the numbers 6 and 28:
 * 1 + 2 + 3 = 6
 * 1 + 2 + 4 + 7 + 14 = 28
 * 
 * Write method List<Integer> calcPerfectNumbers(int) that calculates the perfect
 * numbers up to a maximum value, say 10,000.
 */

import java.util.ArrayList;
import java.util.List;

public class Es003 {

  public static List<Integer> calcPerfectNumbers(int n) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (isPerfectNumber(i)) {
        list.add(i);
      }
    }    
    return list;
  }
  public static boolean isPerfectNumber (int n){
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n%i==0){
        sum = sum + i;
      }
    }
    if (sum == n){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    int n = 10000;
    System.out.print(calcPerfectNumbers(n));
  }
}
