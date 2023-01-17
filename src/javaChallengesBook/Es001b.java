package javaChallengesBook;

/*
 * Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
 * to a given maximum value (exclusive) and output it to the console. Write method void
 * calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
 * values instead of performing the console output.
 */
public class Es001b {
  public static int[] calcSumAndCountAllNumbersDivBy_2_Or_7(int n) {
    int[] result = new int[2];
    result[0] = 0;
    result[1] = 0;
    if (n>=0){
      for (int i = 1; i < n; i++) {
        if ((i%2 == 0) || (i%7 == 0)){
          result[0]++;
          result[1]= result[1]+i;
        }
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int n = 15;
    System.out.print("I numeri divisibili per 2 o per 7 sono in tutto ");
    System.out.print(calcSumAndCountAllNumbersDivBy_2_Or_7(n)[0]);
    System.out.print(", e la loro somma fa ");
    System.out.println(calcSumAndCountAllNumbersDivBy_2_Or_7(n)[1]);
  }
}
