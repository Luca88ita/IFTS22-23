package home.java;

import java.io.*;

public class Home007 {
  public static void createNewFile() {

  }

  /******************************/
  public static void verifyFileExistance(String fileName) {
    File myFile = new File(fileName);
    if (myFile.exists()) {
      System.out.println(myFile.getName() + " esiste");
      System.out.println("Il file ha dimensione " + myFile.length() + " bytes");
      if (myFile.canRead())
        System.out.println(" è leggibile");
      else
        System.out.println(" è illeggibile o corrotto");
      if (myFile.canWrite())
        System.out.println(" è scrivibile");
      else
        System.out.println(" è di sola lettura");
      System.out.println("L'indirizzo del documento è: " + myFile.getAbsolutePath());
      System.out.println("Nome del file: " + myFile.getName());
      System.out.println("Dimensione del file: " + myFile.length() + " bytes");
      openExistingFile(fileName);
      writeFile(fileName);
    } else
      System.out.println("Il file non esiste");
  }

  /******************************/
  public static void openExistingFile(String fileName) {
    File file = new File(fileName);
    try (FileInputStream fis = new FileInputStream(file)) {
      int content;
      while ((content = fis.read()) != -1) {
        // convert to char and display it
        System.out.print((char) content);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /********************************/
  public static void writeFile(String fileName) {
    String s = "Questo verrà scritto all'interno del file";
    System.out.println(" ==> Sto scrivendo nel file '" + fileName + "'': '" + s + "'");
    try (FileWriter outFile = new FileWriter(fileName);
        BufferedWriter bWriter = new BufferedWriter(outFile)) {
      bWriter.write(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String fileName = "D:/prova.txt";
    verifyFileExistance(fileName);
  }
}
