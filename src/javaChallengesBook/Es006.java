package javaChallengesBook;
/*
 * 
 * Create method int calcChecksum(String) that performs the following position-based
 * calculation for the checksum of a number of any length given as a string, with the n digits
 * modeled as z1 to zn:
 * 
 */
public class Es006 {
  public static int calcChecksum(String s) {
    char c;
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);
      sum = sum + (Character.getNumericValue(c)*(i+1));
    }
    return sum%10;
  }
  public static void main(String[] args) {
    String n = "87654321";
    System.out.print(calcChecksum(n));
  }
}
