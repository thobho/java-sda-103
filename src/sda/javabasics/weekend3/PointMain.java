package sda.javabasics.weekend3;

import java.util.ArrayList;
import java.util.Random;

public class PointMain {

  public static void main(String[] args) {


    Point krzysio = new Point(1,2);

    int x = krzysio.getX();


















    krzysio.setX(100);
    System.out.println(krzysio);

    krzysio.zeroAll();
    System.out.println(krzysio);

    ArrayList<Point> myRandomPoints = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      int randomX = new Random().nextInt();
      int randomY = new Random().nextInt();
      Point point = new Point(randomX,randomY);
      myRandomPoints.add(point);
    }
    System.out.println(myRandomPoints);

  }

}
