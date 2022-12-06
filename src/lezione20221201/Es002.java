package lezione20221201;

public class Es002 {

    public static int lunghezza (String a){
        return a.length();
    } // ritorna la lunghezza della stringa
    public static String repeat(String a){
        return a.repeat(5);
    } // ripete la stampa 5 colte
    public static String sostituisci(String a){
        return a.replace("a","e");
    } //
    public static String minconc(String a){
        return (a.toLowerCase()+a.length());
    }
    public static void main(String[] args) {
        String nome = "Luca";
        System.out.println(nome.length());
        System.out.println(nome.startsWith("L"));
        System.out.println(nome.contains("ca"));
        System.out.println(lunghezza(nome));
        System.out.println(repeat(nome));
        System.out.println(sostituisci(nome));
        System.out.println(minconc(nome));

    }
}
