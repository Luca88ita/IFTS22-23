package lezione20221212;

public class Es021 {
  public static int random (){
    return ((int) (Math.random()*90)+1);
  }
  public static int[] tombola(){
    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = random();
    }
    return a;
  }
  public static void arrayPrint (int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Il "+(i+1)+"° elemento dell'array è "+arr[i]);
    }
  }
  public static void main(String[] args) {

  }
}
