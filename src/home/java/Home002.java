package home.java;

/*
 * Rolling 2 dices and summing up the result
*/
public class Home002 {
  public static int diceRoll() {
    return ((int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {
    int n1 = diceRoll();
    int n2 = diceRoll();
    System.out.println("Il primo dado ha dato " + n1);
    System.out.println("Il secondo dado ha dato " + n2);
    System.out.println("Il primo dado ha dato " + (n1 + n2));
  }
}
