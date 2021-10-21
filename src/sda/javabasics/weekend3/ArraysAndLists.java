package sda.javabasics.weekend3;

import java.util.ArrayList;

public class ArraysAndLists {

  public static void main(String[] args) {

    ArrayList<Integer> integers = new ArrayList<>();

    integers.add(1);
    integers.add(100);
    integers.add(11000);
    System.out.println(integers);

    int elementOnIndex1 = integers.get(1);
    System.out.println(elementOnIndex1);

    integers.remove(1);
    System.out.println(integers);

    integers.set(0, 1233);
    System.out.println(integers);

    int size = integers.size(); //integer.length

  }

  static int[] addToArray(int[] input, int newInt){
    //1. Stworz nowa tablice wiekszo o 1 od dlugosci tablicy intput
    //2. Przepisz za pomoca petli for wszystkie elementy tablicy input do tej nowej
    //3. Dodaj newInt na ostatni index w nowej tablicy
    //4. Zwroc tablice

    int inputArrayLength = input.length;
    int[] newArray = new int[inputArrayLength + 1];

    for (int i = 0; i < inputArrayLength; i++) {
      newArray[i] = input[i];
    }

    int lastIndexOfNewArray = newArray.length - 1;
    newArray[lastIndexOfNewArray] = newInt;

    return newArray;
  }

}
