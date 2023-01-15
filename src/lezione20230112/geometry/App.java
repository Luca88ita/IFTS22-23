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
    Triangle t = new Triangle();
    t.set(new Point(0,0), new Point(0,3), new Point(4,0));

    Movable m = r;

    if (m instanceof Circle){
      Circle c2 = (Circle) m;
      System.out.println(c2.getArea());
    }else {
      System.out.println("Downcast non possibile");
    }

    System.out.println(t);
    System.out.println("L'area del triangolo è di "+t.getArea()+" cm quadrati");
    System.out.println("Il perimetro del triangolo è di "+t.getPerimeter()+" cm");

  }
}
