package lezione20230112.geometry;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Circle c = new Circle(new Point(2,3),10);
    Rectangle r = new Rectangle(new Point(0,0), new Point(10,10));
    System.out.println(c);
    System.out.println(r);
    r.move(10,10);
    System.out.println(r);
    System.out.println("************************");
    System.out.println("L'area del cerchio è "+c.getArea()+" cm quadrati");
    System.out.println("Il perimetro del cerchio è "+c.getPerimeter()+" cm");
    System.out.println("L'area del rettangolo è "+r.getArea()+" cm quadrati");
    System.out.println("Il perimetro del rettangolo è "+r.getPerimeter()+" cm");
    System.out.println("************************");
    List<Computable> cc = new ArrayList<>();
    cc.add(c);
    cc.add(r);
    Movable m = r;
    if (m instanceof Circle){
      Circle c2 = (Circle) m;
      System.out.println(c2.getArea());
    }else {
      System.out.println("Downcast non possibile"); // in pratica verifico che non posso fare il downcast di un rettangolo da movable (che è una classe più generica) a Circle (che è una classe più specifica)
    }
    System.out.println("************************");
    Triangle t = new Triangle();
    t.set(new Point(-4,0), new Point(0,0), new Point(0,3));
    System.out.println(t);
    System.out.println("L'area del triangolo è di "+t.getArea()+" cm quadrati");
    System.out.println("Il perimetro del triangolo è di "+t.getPerimeter()+" cm");
    t.translate(1, 1);
    System.out.println("Il triangolo è traslato di coordinate [1,1]; adesso i punti giacciono in: "+t);
    t.move(10, 10);
    System.out.println("Il triangolo è stato spostato in coordinate [10,10]; adesso i punti giacciono in: "+t);
    t.translate(1, 1);
    System.out.println("Il triangolo è traslato di coordinate [1,1]; adesso i punti giacciono in: "+t);
    System.out.println("L'area del triangolo è di "+t.getArea()+" cm quadrati");
    System.out.println("Il perimetro del triangolo è di "+t.getPerimeter()+" cm");
    System.out.println("************************");
    t.moveA(0, 0);
    System.out.println(t);
    t.moveB(0, 0);
    System.out.println(t);
    t.moveC(0, 0);
    System.out.println(t);
  }
}
