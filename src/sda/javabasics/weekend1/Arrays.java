package sda.javabasics.weekend1;

public class Arrays {

  //[1,2,3,200,55] => [10,20,30,2000,550]
  public static void main(String[] args) {

    int[] myFirstArray = new int[5];

    myFirstArray[0] = 10;
    myFirstArray[1] = 123;
    myFirstArray[2] = 4532;
    myFirstArray[3] = 434;
    myFirstArray[4] = 42342343;

    int length = myFirstArray.length;

    for (int i = 0; i < length; i++) {
      int numberAtIndexI = myFirstArray[i];
      System.out.println(numberAtIndexI);
    }


    //ZADANIE 1.
    //[1,2,3,200,55] => [10,20,30,2000,550]
    int[] array = {1,2,3,200,55}; //lenght = 5
    //             0,1,2, 3 , 4

    for (int i = 0; i < array.length; i++) {
      int elementAtIndexI = array[i];  //<-wyciaganie z tablicy do zmiennej
      array[i] = elementAtIndexI * 10; // <-wkladanie do tablicy (innej) wartosci
    }

    //najktórsze rozwiązanie
    //    for (int i = 0; i < array.length; i++) {
    //      array[i] *= 10;
    //    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    //Zadanie 2.
    //[1,2,3,4,5,6,7,8,9] => [9,2,3,4,5,6,7,8,1]

    int[] someArray = {1,2,3,4,5,6,7,8,9}; //length = 9, ostatni index = 8
    int lastElementIndex = someArray.length - 1; //8

    int temporary = someArray[lastElementIndex];
    someArray[lastElementIndex] = someArray[0];
    someArray[0] = temporary;


    //Zadanie 3. Zssumuj elementy w tablicy, ale tylko te, ktore sa parzyste
    //[2,3,5,5,10,100] => 112
    int[] arrayToSum = {2,3,5,5,10,100};
    int sumElement = 0;

    for (int i = 0; i < arrayToSum.length; i++) {
      int elementFromIndex = arrayToSum[i];
      if(elementFromIndex % 2 == 0){ //znajdowanie tylko parzystych wartosci w komorce tablicy
        sumElement += elementFromIndex;
      }

    }

    System.out.println("Wynik działania: " + sumElement);






  }
}
