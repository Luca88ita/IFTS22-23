package lezione20230112.geometry;

import java.util.Objects;

public class Circle implements Movable,Computable{
  Point center;
  double radius;

  public Point getCenter() {
    return center;
  }

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle round = (Circle) o;
    return Double.compare(round.radius, radius) == 0 && Objects.equals(center, round.center);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, radius);
  }
  public void move(double x, double y) {
    this.center.move(x, y);
  }

  public void translate(double x, double y) {
    this.center.translate(x, y);
  }
  @Override
  public String toString() {
    return "Round{" +
            "center=" + center +
            ", radius=" + radius +
            '}';
  }

  @Override
  public double getArea() {
    return Math.PI*radius*radius;
  }

  @Override
  public double getPerimeter() {
    return radius*2*Math.PI;
  }
}
