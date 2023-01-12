package lezione20230112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Es033 {

  public static String readFirstLine(String filename) throws FileNotFoundException {
    BufferedReader br = new BufferedReader(new FileReader(filename));
    return "ciao";
  }
  public static String readFirstLine2(String filename) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));
    } catch (FileNotFoundException e){
      //e.printStackTrace();
    }
    return "impossibile leggere il file";
  }
  public static String readFirstLine3(String filename) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String line = br.readLine();
      br.close();
      return line;
    } catch (FileNotFoundException e){
      throw new RuntimeException("Impossibile trovare il file");
    } catch (IOException e){
      throw new RuntimeException("Errore Boh");
    }
  }
  public static String readFirstLine4(String filename) {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))){
      return br.readLine();
    } catch (IOException e){
      throw new RuntimeException("Impossibile trovare il file");
    }
  }
  public static void main(String[] args) /*throws FileNotFoundException*/{
    //String line = readFirstLine("./src/lezione20221222/cars.csv");
    String line2 = readFirstLine2("./src/lezione20221222/cars.csv");
    String line3 = readFirstLine3("./src/lezione20221222/carss.csv");
    //System.out.println(line);
    System.out.println(line2);
    System.out.println(line3);
  }
}
