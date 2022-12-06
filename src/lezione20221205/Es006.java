package lezione20221205;

import java.util.Scanner;

public class Es006 {
    /*
    * Programma per richiedere n tel senza prefisso 9/10 cifre e chiedere se corretto il messaggio da inviare e ristampare i dati a video
    * */
    public static void sendMessage (long n){
        if ((n > 99999999) && (n <= 9999999999l)){
            System.out.println("inserisci il messaggio da inviare");
            Scanner scanner = new Scanner(System.in);
            String message= scanner.nextLine();
            System.out.println("hai inviato il seguente messaggio '"+message+"' al numero "+n);
        }
        else {
            System.out.println("hai inserito un numero non valido");
        }
    }
    public static void sendMessage2 (String n){
        String prefixLesssNumber = "";
        if (n.length()<10 || n.length()>18){
            System.out.println("Hai inserito un numero non valido - numero troppo corto");
            return;
        }
        if (n.length()>10){
            //char plus = n.charAt(0);
            if (n.charAt(0)!='+'){
                System.out.println("Hai inserito un numero non valido - prefisso non valido");
                return;
            }
            String prefix = n.substring(1,3);
            System.out.println("Il prefisso internazionale è "+prefix);
            prefixLesssNumber = n.substring(3);
            prefixLesssNumber = prefixLesssNumber.replaceAll(" ","");
            System.out.println("Il numero senza prefisso internazionale è "+prefixLesssNumber);
        }
        System.out.println("inserisci il messaggio da inviare");
        Scanner scanner = new Scanner(System.in);
        String message= scanner.nextLine();
        System.out.println("hai inviato il seguente messaggio '"+message+"' al numero "+n);
        long numericNumber = Long.parseLong(prefixLesssNumber); // la funzione parseLong, data una stringa, ritorna un numero long
        System.out.println("il numero in formato numerico senza prefisso è "+numericNumber);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //long numero = scanner.nextLong();
        //sendMessage(numero);
        System.out.println("inserisci il numero di telefono");
        String numero = scanner.nextLine();
        sendMessage2(numero);
    }
}
