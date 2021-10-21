package sda.javabasics.weekend1;

public class Arrays2D {

  public static void main(String[] args) {

    //Deklaracja tablicy 2-wymiarowej
    int[][] my2DArray = {
        {1,2,3}, //index: 0
        {3,4,5}, //index: 1
        {5,6,7}  //index: 2
    };

    //Wpisanie elementu to tablicy dwuwymiarowej
    my2DArray[0][2] = 100;

    //Wyświetlenie wszystkich komórek tablic 2-wymiarowej w konsoli
    for (int i = 0; i < my2DArray.length; i++) {
      for (int j = 0; j < my2DArray[i].length; j++) {
        System.out.print("[" + my2DArray[i][j] + "]");
      }
      System.out.println();
    }

  }

}
