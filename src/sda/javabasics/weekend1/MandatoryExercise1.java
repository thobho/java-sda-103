package sda.javabasics.weekend1;

public class MandatoryExercise1 {

//  1. (o1) Dla podanej liczby n znajdź silnię: n!. Silnia dla n jest definiowana jako 1 * 2 * 3 *...* n. n!

  public static void main(String[] args) {

  }

  private static void oddNumberSum() {
    int n = 10;

    int result = 0;

    //1 + 3 + 5 + 7 + ...
    for (int i = 1; i <= n; i = i + 2) {
      result += i;
    }

    System.out.println("Wynikt to: " + result);
  }

  private static void factorial() {
    int n = 10;

    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    System.out.println("Wynikt to: " + result);
  }

}
