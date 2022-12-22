package lezione20221222;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Es031 {
  public static List<String> readCars(String filename) throws IOException {
    List<String> lines = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))){
      for (;;){
        String line = br.readLine();
        if (line==null) break;
        lines.add(line);
      }
    }
    return new ArrayList(new LinkedHashSet(lines)); // serve per eliminare i duplicati memorizzando la posizione originale della stringa
  }
  public static void main(String[] args) throws IOException {
    List<String> lines = readCars("./src/lezione20221222/cars.csv");
    for (String line : lines){
      System.out.println((line));
    }
  }
}
