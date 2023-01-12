package gardening;

import gardening.tools.Tool;

public class App {
  public static void main(String[] args) throws IllegalAccessException {
    Tool x = new Tool("Secchio", 100.50, "Secchio con coperchio","10/01/2023");
    Tool y = new Tool();
    y.set("prova",10,"prova","01/01/2023");
    Tool z = new Tool();
    z.set("Secchio OBI", 100.50, "Secchio con coperchio","10/01/2023");
    x.setToolName("Secchio OBI");
    y.setToolName("Prova2");
    Tool err = new Tool();
    //err.set("",10,"prova","01/01/2023");
    System.out.println(x.getToolName());
    System.out.println(x);
    System.out.println(y);
    System.out.println(y.hashCode());
    System.out.println(x.equals(y));
    System.out.println(x.equals(z));
    System.out.println("*****************");
    System.out.println(err);
  }
  
}
