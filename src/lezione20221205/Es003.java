package lezione20221205;

public class Es003 {
    /*
    * ax^2+bx+c = 0
    * a: coeff x di secondo grado
    * b: coeff x di primo grado
    * c: termine noto
    * */
    static void secondDegreeEquation(float a, float b, float c){
        float delta = b*b -4*a*c;
        float den = 2*a;
        if (a==0) {
            System.out.println("Il coefficente di secondo grado non può essere 0");
        } else if (delta >= 0) {
            float result1 = (-b + (float) Math.sqrt(delta)) / den;
            float result2 = (-b - (float) Math.sqrt(delta)) / den;
            System.out.println(result1);
            System.out.println(result2);
        } else{
            System.out.println("Il delta è negativo");
        }
    }
    public static void main(String[] args) {
        float n1=0;
        float n2=5;
        float n3=6;
        secondDegreeEquation(n1,n2,n3);
    }
}
