package verifica20221219;

public class Es001 {
  public static int contaLowerCase(String[] arr){
    int contatore = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(arr[i].toLowerCase())){
        contatore++;
      }
    }
    return contatore;
  }
  public static void main(String[] args) {
    String[] arr = {"ciao","Ciao","gatto","Cane","cane"};
    System.out.println("Le parole che sono completamente in minuscolo sono "+contaLowerCase(arr));
  }
}
