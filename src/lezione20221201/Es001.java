package lezione20221201;

import java.awt.*;
import java.util.Date;

public class Es001 {
    public static double sum(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double prod(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        if (b != 0){
            return a/b;
        }
        else {
            System.out.println("Errore. Non dividere per 0!");
            return 0;
        }
    }

    public static void move(Point p){
        p.move(5,5);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*System.exit(17); */
        int a; /* rappresenta il numero intero a 32 bit, da -2B a 2B */
        byte b; /* rappresenta il numero intero a 8 bit, da -128 a 127 */
        short c; /* rappresenta il numero intero a 16 bit, da -32K a 32K */
        long d; /* rappresenta il numero intero a 64 bit */

        float cc = 1.2F; /* rappresenta il numero con virgola a 32bit */
        double dd = 1.2; /* rappresenta il numero con virgola a 64bit */

        char ch = 'a';

        boolean bb = true; /* occupano 8 bit (sprecandoli) */
        /*-----------------------*/
        System.out.println("/*-----------------------*/");
        // conversione esplicita
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        // conversione inplicita
        int myInt2 = 9;
        double myDouble2 = myInt2; // Automatic casting: int to double
        System.out.println(myInt2);      // Outputs 9
        System.out.println(myDouble2);   // Outputs 9.0
        System.out.println("/*-----------------------*/");
        String s = "ciao";
        String s2 = new String();

        Date ddd = new Date();
        Point p = new Point(2,3);
        System.out.println(p+" - "+s);
        System.out.println(sum(2,3));
        move(p);
        System.out.println("il nuovo valore di p è "+p);
        System.out.println("/*-----------------------*/");
        double n1 = 7;
        double n2 = 0;
        System.out.println(sum(n1,n2));
        System.out.println(sub(n1,n2));
        System.out.println(prod(n1,n2));
        System.out.println(div(n1,n2));
    }
}