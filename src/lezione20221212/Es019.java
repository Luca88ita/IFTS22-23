package lezione20221212;

public class Es019 {
  public static int splitTillEven(int x){
    do{
      x = x/2;
    } while (x%2 != 0);
    return x;
  }
  public static void collatz(int x){
    System.out.println("Il numeri ottenuti tramite la congettura di Collatz col numero "+x+" è la seguente:");
    do{
      if (x == 1){
        System.out.println(x);
        break;
      } else{
        if (x%2 == 1) {
          x = (x * 3) + 1;
          System.out.println(x);
        }
        if (x%2 ==0){
          x= x/2;
          System.out.println(x);
        }
      }
    }while(x > 1);
    System.out.println("--------------------");
  }
  public static void main(String[] args) {
    int[] n = {71,100,25,99,1351};
    for (int i = 0; i < n.length; i++) {
      System.out.println(splitTillEven(n[i]));
    }
    System.out.println("--------------------");
    System.out.println("Esercizio 2");
    System.out.println("--------------------");
    for (int i = 0; i < n.length; i++) {
      collatz(n[i]);
    }
  }
}