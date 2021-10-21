package sda.javabasics.weekend2.demo;

//loops, break, continue
public class Loops {


  public static void main(String[] args) {

    int maxInt = 10;
    int counter = 0;

    while (counter < maxInt) {
      counter++;

      if (counter == 5) {
        continue; // zamień na `break` i sprawdz jak zachowa się program
      }

      System.out.println(counter);

    }

  }

}
