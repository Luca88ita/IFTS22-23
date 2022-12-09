package lezione20221207;

import java.util.Scanner;
/*
*
*
* */
public class Es008 {
    public static String sayHello(String n){
        return "Hello "+n;
    }
    public static String sayGoAway(String n){
        return "Go Away "+n+"!";
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)){
            System.out.print("Insert your name: ");
            String name = scn.next();
            if (name.equals("Luca")) {
                System.out.println(sayHello(name));
            } else {
                System.out.println(sayGoAway(name));
            }
        }

    }
}
