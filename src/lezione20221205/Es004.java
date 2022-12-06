package lezione20221205;

public class Es004 {
    /*programma per comunicare in output la scuola che si fa in base all'età data in input
    * */
    public static void attSchool(float age){
        if (age<0){
            System.out.println("Hai inserito un'età impossibile");
        } else if (age<4) {
            System.out.println("In teoria stai andando al nido");
        } else if (age<6) {
            System.out.println("In teoria stai andando all'asilo");
        } else if (age<11) {
            System.out.println("In teoria stai andando alle elementari");
        } else if (age<14) {
            System.out.println("In teoria stai andando alle medie");
        } else if (age<19) {
            System.out.println("In teoria stai andando alle superiori");
        } else if (age<23) {
            System.out.println("In teoria stai frequentando la triennale");
        } else if (age<25) {
            System.out.println("In teoria stai frequentando la specialistica");
        }  else if (age<68) {
            System.out.println("In teoria stai lavorando");
        }  else {
            System.out.println("Dovresti esser pensionato");
        }
    }
    public static void main(String[] args) {
        float n1 = 10;
        float n2 = 5;
        float n3 = 16;
        float n4 = 19;
        float n5 = 22;
        float n6 = 24;
        float n7 = 3;
        float n8 = 66;
        float n9 = 69;
        attSchool(n1);
        attSchool(n2);
        attSchool(n3);
        attSchool(n4);
        attSchool(n5);
        attSchool(n6);
        attSchool(n7);
        attSchool(n8);
        attSchool(n9);
    }
}
