package javaChallengesBook;
  /*
   * Write method int calc(int, int) that multiplies two variables, m and n of type int,
   * then divides the product by two, and outputs the remainder with respect to division by 7.
   */
public class Es001a {
  public static int calc(int m, int n) {
    int result = ((m*n)/2)%7;
    return result;
  }
  public static void main(String[] args) {;
    int m = 5;
    int n = 5;
    System.out.println(calc(m,n));
  }
}
