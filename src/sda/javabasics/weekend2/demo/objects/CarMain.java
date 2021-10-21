package sda.javabasics.weekend2.demo.objects;

import java.util.Scanner;

public class CarMain {

  public static void main(String[] args) {
    Car car = new Car();
    car.showLocalisation();

    var scanner = new Scanner(System.in);

    while (true) {
      int i = scanner.nextInt();
      switch (i) {
        case 1: {
          car.moveUp();
        }
        break;
        case 2: {
          car.moveDown();
        }
        break;
        case 3: {
          car.moveLeft();
        }
        break;
        case 4: {
          car.moveRight();
        }
        break;
        case 5: {
          return;
        }
      }
      car.showLocalisation();
    }
  }
}
