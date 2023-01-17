package lezione20230112.geometry;

import java.util.Objects;

public class Triangle implements Movable, Computable {
  Point a;
  Point b;
  Point c;

  public Triangle(Point a, Point b, Point c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public Triangle(){
    this.a = new Point(0,0);
    this.b = new Point(0,0);
    this.c = new Point(0,0);
  }
  public Point getA(){
    return a;
  }
  public Point getB(){
  return b;
  }
  public Point getC(){
  return c;
  }
  public void set(Point a,Point b,Point c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void setA(Point a){
    this.a = a;
  }
  public void setB(Point b){
  this.b = b;
  }
  public void setC(Point c){
  this.c = c;
  }
  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o== null || getClass() != o.getClass()) return false;
    Triangle triangle = (Triangle) o;
    return Objects.equals(a, triangle.a) && Objects.equals(b, triangle.b) && Objects.equals(c, triangle.c);
  }
  @Override
  public int hashCode() {
    return Objects.hash(a, b, c);
  }
  private double getSideLength(Point x, Point y){
    /*sqrt(((Bx-Cx)^2)+((By-Cy)^2)) */
    return Math.sqrt((Math.pow((y.getX()-x.getX()),2))+(Math.pow((y.getY()-x.getY()),2)));
  }
  @Override
  public double getArea() {
    double perimeter = getPerimeter();
    double x = getSideLength(a, b);
    double y = getSideLength(b, c);
    double z = getSideLength(c, a);
    double area = Math.sqrt((perimeter/2)*(perimeter/2-x)*(perimeter/2-y)*(perimeter/2-z));
    return area;
  }
  @Override
  public double getPerimeter() {
    double x = getSideLength(a, b);
    double y = getSideLength(b, c);
    double z = getSideLength(c, a);
    double perimeter = x+y+z;
    return perimeter;
  }
  @Override
  public void move(double x, double y) {
    double diffX = x-a.getX();
    double diffY = y-a.getY();
    translate(diffX, diffY);
  }
  public void moveA(double x, double y) {
    double diffX = x-a.getX();
    double diffY = y-a.getY();
    translate(diffX, diffY);
  }
  public void moveB(double x, double y) {
    double diffX = x-b.getX();
    double diffY = y-b.getY();
    translate(diffX, diffY);
  }
  public void moveC(double x, double y) {
    double diffX = x-c.getX();
    double diffY = y-c.getY();
    translate(diffX, diffY);
  }
  @Override
  public void translate(double x, double y) {
    this.a.translate(x, y);
    this.b.translate(x, y);
    this.c.translate(x, y);    
  }
  @Override
  public String toString() {
    return "Triangle{" +
            "Point A " + a +
            ", Point B " + b +
            ", Point C " + c +
            '}';
  }
}