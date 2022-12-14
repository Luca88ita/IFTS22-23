package lezione20221212;

import java.util.Scanner;

public class Es021Estrazioni {
  /**
   * Simple function used to perform an action once the key 'Enter' is pressed
   * @param x is listening for the pressing of key 'Enter'
   */
  public static void pressEnter(Scanner x){ 
    try{
      //System.in.read();
      x.nextLine();
    } catch(Exception e) {
    }  
  }
  /**
   * Function wich returns a random number between 1 and 90 included
   * @return a number [1,90]
   */
  public static int random (){
    return ((int) (Math.random()*90)+1);
  }
  /**
   * function wich controls the existance in a given array of a given int number and returns a boolean value
   * @param arr is the array of int that we want to check
   * @param n is the int number we want to verify the not existence in the array
   * @return true if n doesn't exist in arr, false if n is already in arr
   */
  public static boolean control(int[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        return false;
      }
    }
    return true;
  }
  /**
   * functiion wich returns a int value to assign; to work correctly it needs to use 2 functions, random() and control()
   * @param arr is the array we will need to check with the control function
   * @return an int value which corresponds to the unique (meaning not already into the array) value we are going to insert in the array
   */
  public static int valueToAssign(int[] arr) {
    boolean prova = false;
    int temp = 0;
    while (prova == false) {
      temp = random();
      prova = control(arr, temp);
    }
    return temp;
  }
  /**
   * function which inserts into the array the new unique (meaning not already into the array) value; to work it needs to use the function valueToAssign()
   * @param j is the amountof numbers we want to draw
   * @return an array with j int numbers
   */
  public static int[] drawing(int j){
    int[] arr = new int[j];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=valueToAssign(arr);
    }
    return arr;
  }
  /**
   * function which simply prints out the given array, and waits for the user input to proceed with the next printout
   * @param arr is the array the function receives to be printed
   */
  public static void arrayPrint (int[] arr){
    Scanner entScanner = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      if (i<(arr.length-1)){
        System.out.println("Il "+(i+1)+"° numero estratto è "+arr[i]);
        System.out.println("Premi invio per estrarre il numero successivo o Ctrl+c per terminare l'esecuzione");
        pressEnter(entScanner);
      }
      else{
        System.out.println("Il "+(i+1)+"° ed ultimo numero estratto è "+arr[i]);
        System.out.println("Premi invio per tornare alla pagina principale");
        pressEnter(entScanner);
      }
    }
  }
  public static void main(String[] args) {
    //Scanner prova = new Scanner(System.in);
    //int[] n1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70};
    //System.out.println("Inserisci il numero da confrontare");
    //int n2 = prova.nextInt();
    //String result = control(n1, n2)==true ? "il numero è diverso dai precedenti":"il numero corrisponde con uno già inserito";
    //System.out.println(result);

    //int n2 = valoreDaAssegnare(n1);
    //System.out.printf("Il valore da inserire nell'array è %d%n",n2);
    char selection;
    Scanner scn = new Scanner(System.in);
    do {
      System.out.println("""

      
        Seleziona:
          1) per l'estrazione dei 6+1 numeri del SuperEnalotto
          2) per l'estrazione dei 5 numeri del Lotto
          3) per l'estrazione dei 10 numeri del 10 e Lotto
          4) per l'estrazione della tombola (fino a 90 numeri)

          q) se vuoi terminare il programma
      """);
      selection = scn.nextLine().charAt(0);
      switch (selection) {
        case '1':
          arrayPrint(drawing(7));
          break;
        case '2':
          arrayPrint(drawing(5));
          break;    
        case '3':
          arrayPrint(drawing(10));
          break; 
        case '4':
          arrayPrint(drawing(90));
          break;
        case 'q':
          break;      
        default:
          System.out.println("Hai inserito un comando non valido! Premi invio per tornare al menù principale");
          pressEnter(scn);
          break;
      }
    } while (selection!='q');
    scn.close();
  }
}


/*
arr[0] è inizializzato con il primo numero random. // si può evitare questo passaggio asincrono
la funzione di controllo è un ciclo for che deve controllare che il successivo numero random estratto (funzione random) non sia uguale con nessuno dei numeri già all'interno dell'array arr[]
  per controllare ciò, bisogna che all'interno del ciclo ci sia un if dove verifichiamo che il numero random sia diverso da quello indicizzato
    nel caso fosse uguale, bisogna estrarre un nuovo numero random e ripetere il ciclo di controllo mantenendo lo stesso indice
  fintanto che il controllo mi da risultato false, devo ritentare l'estrazione

  estraggo 1 numero > con un ciclo controllo se già presente all'interno dell'array > se non è presente, posso scrivere il numero dentro l'array e restituire un valore true.
                                                                                    > se è presente bisogna che restituisca un valore false e ripeta l'estrazione
                                                                                in pratica devo avere una condizione prima dell'estrazione, che me la faccia ripetere 
                                                                                fino a quando non riceve un valore true
*/