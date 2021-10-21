package sda.javabasics.weekend1;

public class MandatoryExercise2 {

//2. (o2) Napisz program, który rysuje w konsoli wzór (patrz nieżej)

  public static void main(String[] args) {
    int treeHeight = 6;

    for (int i = 1; i <= treeHeight; i++) {
      System.out.print(i + ":");

      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      System.out.println();


    }
  }

}
