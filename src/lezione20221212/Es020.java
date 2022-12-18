package lezione20221212;
//popolare stringhe con scanner, verificare duplicati, quanti tipi siano duplicati *rimuovere i duplicati
// contare quanti frutti per tipo
//contare frutti unici nel carrello e stamparli
public class Es020 {
  /**
   * function wich controls the existance in a given array of a given String and returns a boolean value
   * @param arr is the array of String that we want to check
   * @param str is the String we want to verify the not existence in the array
   * @return true if str doesn't exist in arr, false if str is already in arr
   */
  public static boolean control(String[] arr, String str) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(str)) {
        count++;
        if(count>1){
          //System.out.println(str+" è presente più volte");
          //arr[i]="";
          return false;
        }        
      }
    }
    //System.out.println(str+" è un elemento unico");
    return true;
  }
    /**
   * function wich controls the existance in a given array of a given String and returns a boolean value. In the meantime it blanks the duplicated values.
   * @param arr is the array of String that we want to check
   * @param str is the String we want to verify the not existence in the array
   * @return true if str doesn't exist in arr, false if str is already in arr
   */
  public static boolean blankDoubleElements(String[] arr, String str) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(str)) {
        count++;
        if(count>1){
          //System.out.println(str+" è presente più volte");
          arr[i]="";
          return false;
        }        
      }
    }
    //System.out.println(str+" è un elemento unico");
    return true;
  }
  
  public static int findFilledValues(String[] arr) {
    boolean controllo;
    for (int i = 0; i < arr.length; i++) {
      controllo = blankDoubleElements(arr, arr[i]);
      if (controllo == false){
        if (arr[i]!=""){
          System.out.println(arr[i]);
        }
      }
    }
    return 0;
  }
  public static String[] doubleElements(String[] cart){
    String[] temp ={};
    temp[0] = "";
    boolean control;
    for (int i = 0; i < temp.length; i++) {
      control = control(cart, temp[i]);
      if (control == true) {
        temp[i] = cart[i];
      }
    }
    return temp;
  }

  public static void arrayPrint (String[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void uniqueElements (String[] cart){
    for (int i = 0; i < cart.length; i++) {
      int conteggio = 0;
      for (int j = 0; j < cart.length; j++) {
        if(cart[i].equals(cart[j])){
          conteggio++;
        }
      }
      if (conteggio == 1){
        System.out.println(cart[i]);
      }
    }
  }

  public static int findNumberDifferentElement(String[] arr){
    int x;
    int y = 0;
    for (int i = 0; i < arr.length; i++) {
      x=0;
      for (int j = 0; j <= i; j++) {
        if(arr[i].equals(arr[j])){
          x++;
        }
      }
      if (x==1){
        y++;
      }
    }
    return y;
  }
  public static String[] newCleanArray(String[] arr) {
    int l = findNumberDifferentElement(arr);
    String[] temp = new String[l];
    int x;
    int y = 0;
    for (int i = 0; i < arr.length; i++) {
      x=0;
      for (int j = 0; j <= i; j++) {
        if(arr[i].equals(arr[j])){
          x++;
        }
      }
      if (x==1){
        temp[y]=arr[i];
        y++;
      }
    }
    return temp;
  }
  public static void printSingleData(String[] arr) {
    int x;
    for (int i = 0; i < arr.length; i++) {
      x=0;
      for (int j = 0; j <= i; j++) {
        if(arr[i].equals(arr[j])){
          x++;
        }
      }
      if (x==1){
        System.out.println(arr[i]);
      }
    }
  }
  public static void main(String[] args) {
    String[] cart = {"Mela","Arancia","Mela","Pera","Mela","Mela","Pera","Mela","Pera"};
    //uniqueElements(cart);
    //control(cart, "Pera");
    //System.out.println("gli elementi doppi dell'array sono:");
    //arrayPrint(doubleElements(cart));
    /*arrayPrint(cart);
    System.out.println("*********************");
    findFilledValues(cart);
    System.out.println("*********************");
    arrayPrint(cart);
    System.out.println("*********************");*/
    System.out.println("Nell'array ci sono "+findNumberDifferentElement(cart)+" elementi diversi:");
    //printSingleData(cart);
    arrayPrint(newCleanArray(cart));
    System.out.println("*********************");
  }
}