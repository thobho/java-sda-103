package sda.javabasics.weekend1;

public class MandatoryExercise5 {

//  5. (o5) Napisz program, który zadeklaruje tablicę 2-wymiarową liczb czałkowitych o wymiarach 10x10.
//  Następnie wypełnij każdą komórkę o 'współrzędnych indexów i, j' wynikiem działania i * j.
//  Na samym końcu wyświetl tą tablicę.
//  Jest to odpowiednik zadania z klasy "FoorLoop.java" z tym, że teraz "zapisujemy" tabliczkę mnożenia do tablicy.

  public static void main(String[] args) {
    int[][] array = new int[10][10];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (i + 1) * (j + 1);
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%4s", array[i][j]);
      }
      System.out.println();
    }

  }

}
