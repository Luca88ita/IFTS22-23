package verifica20221219;
// intero numerico positivo
//primo intero suepriore a quel numero che non contenga acuna delle cifre del numero di partenza
// es 6742 >8000
public class Es005 {
  public static void numberControl(int n){

  }
  public static int baseDieci(int n){
    int m = n;
    int i;
    System.out.println(m+" è composto da");
    for (i = 0; m > 0; i++) {
      System.out.println(m%10+" x 10 ^"+i);
      m /= 10;
    }
    return i;
  }
  // trovare le cifre del numero di partenza
  // tenerle in memoria dentro una lista di integer
  // verificare che non ci siano più di 9 cifre diverse
    // verificare che in questo caso l'unica cifra rimasta non utilizzata non sia lo 0
  // il risultato deve essere una combinazione delle cifre rimanenti (dove queste possono essere ripetute)
  // il risultato deve essere sicuramente almeno una cifra superiore a quella dell'ultima utilizzata se i numeri vanno da 1 a 8
  // se il numero più grande che abbiamo termina con un 9, sicuramente dobbiamo salire di una
  /*
  devo iniziare la ricerca del numero a partire da n+1
  nelle condizioni devo verificare che le cifre che compongono n non compaiano all'interno del nuovo numero
    i numeri devono essere scomposti in cifre

    l'array lista 1 è composta dai numeri di n, uno per ogni cifra
    l'array lista 2 è vuoto





   */
  public static void main(String[] args) {

  }
}
