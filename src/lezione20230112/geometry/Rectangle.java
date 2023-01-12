package lezione20230112.geometry;

import java.util.Objects;

public class Rectangle implements Movable, Computable{
  Point vertexA;
  Point vertexB;

  public Rectangle(Point vertexA, Point vertexB) {
    this.vertexA = vertexA;
    this.vertexB = vertexB;
  }

  public Point getVertexA() {
    return vertexA;
  }

  public void setVertexA(Point vertexA) {
    this.vertexA = vertexA;
  }

  public Point getVertexB() {
    return vertexB;
  }

  public void setVertexB(Point vertexB) {
    this.vertexB = vertexB;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(vertexA, rectangle.vertexA) && Objects.equals(vertexB, rectangle.vertexB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexA, vertexB);
  }

  @Override
  public void move(double x, double y) {
    double h = getHeight();
    double w = getWidth();
    this.vertexA.move(x,y);
    this.vertexB.move((x+h),(y+w));
  }

  @Override
  public void translate(double x, double y) {
    this.vertexA.translate(x,y);
    this.vertexB.translate(x,y);
  }
  private double getWidth(){
    return Math.abs(vertexA.getX()-vertexB.getX());
  }
  private double getHeight(){
    return Math.abs(vertexA.getX()-vertexB.getX());
  }

  @Override
  public double getArea() {
    return getWidth()*getHeight();
  }

  @Override
  public double getPerimeter() {
    return (getWidth()+getHeight())*2;
  }
  @Override
  public String toString() {
    return "Rectangle{" +
            "Lower Left " + vertexA +
            ", Upper Right " + vertexB +
            '}';
  }

}
