package sda.javabasics.weekend1;

public class Exercises {

  //ZADANIE:
  //Wysweitl sume liczb od 1 do 100;
  // x = 1 + 2 + 3 + ... + 100
  public static void main(String[] args) {

    int i = 0;
    int actualSum = 0;

    while (i <= 100) {
      System.out.println("Przed aktualizacja");
      System.out.println("Counter: " + i);
      System.out.println("Actual sum: " + actualSum);

      i++;
      actualSum = actualSum + i;

      System.out.println("Po aktualizaca");
      System.out.println("Counter: " + i);
      System.out.println("Actual sum: " + actualSum);
      System.out.println("=========================");

    }

    System.out.println(actualSum);

  }

}

// counter | actualSum
//   0          0
//   1         0 + 1 = 1
//   2         1 + 2 = 3
//   3         3 + 3 = 6
//   4         6 + 4 = 10