package sda.javabasics.weekend3;

import java.util.Scanner;

public class Repetion {

  public static void main(String[] args) {
    int x = 10;
    int y = 100;
    boolean areThisIntegersEqual = x == y;
    System.out.println(areThisIntegersEqual);

    String someText = "Ala ma kota";
    String someAnotherText = "Ala ma kota";
    boolean areThisStringEquals = someAnotherText == someText; //wydaje sie
    System.out.println(areThisStringEquals);

    Point point1 = new Point(2, 3);
    Point point2 = new Point(2, 3);

    boolean arePointEquals = point1.equals(point2); //TO JEST PRAWUIDŁOWE PORÓWNANIE!!!
    System.out.println(arePointEquals);


  }

}
