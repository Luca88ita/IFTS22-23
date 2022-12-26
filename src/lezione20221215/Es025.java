package lezione20221215;

import java.util.ArrayList;
import java.util.List;

//funzione che stampi a monitor tutte le cifre di quel numero
public class Es025 {
  public static int[] digits(int n) {
    List<Integer> l = new ArrayList<>();
    while (n > 0) {
      l.add(n % 10);
      n /= 10;
    }
    return toIntArray(l);
  }

  public static int[] toIntArray(List<Integer> list) {
    int[] ret = new int[list.size()];
    for (int i = 0; i < ret.length; i++)
      ret[i] = list.get(i);
    return ret;
  }

  public static int powerSum(int[] digits, int exp) {
    int sum = 0;
    for (int digit : digits) {
      sum += Math.pow(digit, exp);
    }
    return sum;
  }

  public static boolean isArmstrongNumber(int n) {
    return (powerSum(digits(n), 3) == n);
  }

  public static void main(String[] args) {
    for (int i = 1; i < 1000; i++) {
      if (isArmstrongNumber(i)) {
        System.out.println(i);
      }
    }
  }
}
