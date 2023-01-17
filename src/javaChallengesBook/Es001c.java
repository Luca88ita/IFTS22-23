package javaChallengesBook;

/*
 * Create the methods boolean isEven(n) and boolean isOdd(n) that will check if the
 * passed integer is even or odd, respectively.
 */
public class Es001c {
  public static boolean isEven(int n) {
    if (n%2==0) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean isOdd(int n) {
    if (n%2!=0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int n = 15;
    System.out.println(n+" è pari? "+isEven(n));    
    System.out.println(n+" è dispari? "+isOdd(n));    
  }
}
