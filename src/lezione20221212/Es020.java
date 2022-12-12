package lezione20221212;
//poopolare stringhe con scanner, verificare duplicati, quanti tipi siano dupllicati *rimuovere i duplicati

//contare frutti unici nel carrello e stamparli
public class Es020 {
  public static void doubleElements(String[] cart){
    String output;
    for (int i = 0; i < cart.length; i++) {
      for (int j = 0; j < cart.length; j++) {
        if (i!=j){
          if (cart[i].equals(cart[j])){
            System.out.println(cart[i]);
          }
        }
      }
    }
  }
  public static void uniqueElements(String[] cart){
    String output;
    boolean control;
    for (int i = 0; i < cart.length; i++) {
      for (int j = 0; j < cart.length; j++) {
        control = true;
        if (i!=j){
          if (cart[i].equals(cart[j])){
            output = "";
            control = false;
          }
          else{
            output = (cart[i]);
          }
          if (control == true){
            System.out.println(output);
          }
        }
      }
    }
  }

  public static void prova (String[] cart){
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
  public static void main(String[] args) {
    String[] cart = {"Mela","Arancia","Mela","Pera","Mela","Mela","Pera","Mela","Pera"};/*
    System.out.println("gli elementi duplicati dell'array sono:");
    doubleElements(cart);*//*
    System.out.println("gli elementi unici dell'array sono:");
    uniqueElements(cart);*/
    prova(cart);
  }
}
