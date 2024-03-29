package lezione20230112.geometry;

import java.util.Objects;

public class Point implements Movable{
  double x;
  double y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public Point() {
    this.x = 0;
    this.y = 0;
  }
  public double getX() {
    return x;
  }
  public void setX(double x) {
    this.x = x;
  }
  public double getY() {
    return y;
  }
  public void setY(double y) {
    this.y = y;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
  }
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public void move(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void translate(double x, double y) {
    this.x += x;
    this.y += y;
  }
  @Override
  public String toString() {
    return String.format("Coordinates: [x= %.2f , y= %.2f]", x, y);
  }

}
