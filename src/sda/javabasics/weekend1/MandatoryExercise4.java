package sda.javabasics.weekend1;

public class MandatoryExercise4 {

//  4. (o4) Napisz program, który sprawdzi, czy w zadanej tablicy liczb całkowitych znajduje się zadana liczba.
//  Dla dnych podanych niżej program powinien wyświelić napis "5 znajduje się w tablicy". Jeżeli zmienimy `numberToSearch` na 8 - to program ma wyświetlić "8 nie znajduje się w tablicy"
//      ```
//  int array = {1,2,3,4,5,6,7};
//  int numberToSearch = 5;
//
//```
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};

    int numberToSearch = 5;

    boolean isNumberInArray = false;

    for (int i = 0; i < array.length; i++) {
      if(array[i] == numberToSearch) {
        isNumberInArray = true;
      }
    }

    if (isNumberInArray) {
      System.out.println("Liczba " + numberToSearch + " znajduje się w tablicy");
    } else {
      System.out.println("Liczba "+ numberToSearch + " nie znajduje sie w tablicy");
    }

  }
}
