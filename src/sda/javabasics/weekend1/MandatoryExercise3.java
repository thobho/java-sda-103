package sda.javabasics.weekend1;

public class MandatoryExercise3 {

//  3. (o3) Napisz program, który dla podanej tablicy liczb całkowitych poda sumę jej elementów

  public static void main(String[] args) {
    int[] arrayOfElementsToSum = {45,6,3454,43,4534,54,535,35};


    int actualSum = 0;

    for (int i = 0; i < arrayOfElementsToSum.length; i++) {
      actualSum += arrayOfElementsToSum[i];
    }

    System.out.println("Suma elementów tablicy to: "+ actualSum);

  }
}
