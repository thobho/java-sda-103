package sda.javabasics.weekend3;


public class Point {

  private int x;
  private int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void setX(int newValueOfX){
    this.x = newValueOfX;
  }

  public int getX(){
    return this.x;
  }

  public void zeroAll(){
    this.x = 0;
    this.y = 0;
  }












  public String toString() {
    return String.format("x: %s, y: %s", this.x, this.y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Point point = (Point) o;

    if (x != point.x) {
      return false;
    }
    return y == point.y;
  }

  @Override
  public int hashCode() {
    int result = x;
    result = 31 * result + y;
    return result;
  }
}
