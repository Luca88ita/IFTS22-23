package lezione20221222;

public class Applicazione {
  public static void main(String[] args) {
    Car c1 = new Car("Fiat", "Punto",1800.0, "AA333GG");
    Car c2 = new Car("Lotus", "Elise", 1700.0,"AA444GG");
    Car c3 = new Car("VW", "Golf R", 1800.0,"AA555GG");
    Car c4 = new Car("Fiat", "Punto HGT", 1800.0,"AA333TT");
    System.out.println(c1.brand);
    System.out.println(c1.model);
    System.out.println(c1.cc);
    System.out.println(c1.getCc());
    System.out.println(c1);
    c1.setModel("Punto HGT");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c1.equals(c4)); // confronta i valori all'interno degli oggetti.
    System.out.println(c1 == c4); // questo verifica se invece un oggetto è uguale ad un altro (impossibile a meno che c4 non fosse un richiamo a c1) - confronta i riferimenti
  }
}
