package gardening;

import gardening.tools.Tool;

public class App {
  public static void main(String[] args) {
    Tool x = new Tool("Secchio", 100.50, "Secchio con coperchio","10/01/2023");
    x.setToolName("Secchio OBI");
    System.out.println(x.getToolName());
    System.out.println(x);
  }
  
}
