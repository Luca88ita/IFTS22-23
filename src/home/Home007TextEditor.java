package home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Home007TextEditor {
  public static void pressEnterToContinue(Scanner x){ 
    System.out.println("Premi invio per continuare...");
    try{
      System.in.read();
      x.nextLine();
    } catch(Exception e) {
    }  
  }
/*************************************************/
  public static void createNewTxt(Scanner x) {
    try {
      System.out.println("Inserisci il nome del nuovo file .txt da creare (non scrivere l'estensione)");
      String fileName = x.nextLine();
      File myObj = new File("./src/home/"+fileName+".txt");
      if (myObj.createNewFile()) {
        System.out.println("Creato il file: " + myObj.getName());
      } else {
        System.out.println("Impossibile sovrescrivere. File già esistente.");
      }
    } catch (IOException e) {
      System.out.println("Errore durante la creazione del file!");
      e.printStackTrace();
    }
  }
/*************************************************/
public static void overrideTxt(Scanner x){
  try {
    System.out.println("Inserisci il nome del file .txt da modificare (non scrivere l'estensione)");
    String fileName = x.nextLine();
    FileWriter myWriter = new FileWriter("./src/home/"+fileName+".txt");
    System.out.println("Inserisci il testo da inserire nel documento");
    String fileModString = x.nextLine();
    myWriter.write(fileModString);
    myWriter.close();
    System.out.println("Stringa aggiunta correttamente al file");
  } catch (IOException e) {
    System.out.println("Errore durante la scrittura del file!");
    e.printStackTrace();
  }
}
  /*************************************************/
  public static void modifyTxt(Scanner x){
    try {
      System.out.println("Inserisci il nome del file .txt da modificare (non scrivere l'estensione)");
      String fileName = x.nextLine();
      //String fileContent = openTxt(x);
      FileWriter myWriter = new FileWriter("./src/home/"+fileName+".txt");
      System.out.println("Inserisci il testo da inserire nel documento");
      String fileModString = x.nextLine();
      myWriter.write(fileModString);
      myWriter.close();
      System.out.println("Stringa aggiunta correttamente al file");
    } catch (IOException e) {
      System.out.println("Errore durante la scrittura del file!");
      e.printStackTrace();
    }
  }
  /*************************************************/
public static void openTxt(Scanner x){
  try {
    System.out.println("Inserisci il nome del file .txt da aprire (non scrivere l'estensione)");
    String fileName = x.nextLine();
    File myObj = new File("./src/home/"+fileName+".txt");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      System.out.println(data);
    }
    myReader.close();
  } catch (FileNotFoundException e) {
    System.out.println("Errore durante l'apertura del file!");
    e.printStackTrace();
  }
}
/*************************************************/
public static void deleteTxt(Scanner x){
  System.out.println("Inserisci il nome del file .txt da eliminare (non scrivere l'estensione)");
  String fileDel = x.nextLine();
  File myObj = new File("./src/home/"+fileDel+".txt"); 
  if (myObj.delete()) { 
    System.out.println("Cancellato il file: " + myObj.getName());
  } else {
    System.out.println("Errore durante l'eliminazione del file!");
  } 
}
/*************************************************/
  public static void main(String[] args) {
    char selection;
    Scanner scn = new Scanner(System.in);
    do {
      System.out.println("""

      
        Seleziona:
          1) per creare un nuovo documento txt
          2) per sovrascrivere il contenuto di un documento txt
          3) per leggere un documento txt
          4) per cancellare un documento txt

          q) se vuoi terminare il programma
      """);
      selection = scn.nextLine().charAt(0);
      switch (selection) {
        case '1':
          createNewTxt(scn);
          pressEnterToContinue(scn);
          break;
        case '2':
          overrideTxt(scn);
          pressEnterToContinue(scn);
          break;    
        case '3':
          openTxt(scn);
          pressEnterToContinue(scn);
          break; 
        case '4':
          deleteTxt(scn);
          pressEnterToContinue(scn);
          break;
        case 'q':
          break;      
        default:
        System.out.println("Hai inserito un comando non valido");
          break;
      }
    } while (selection!='q');
    scn.close();
  }
}
