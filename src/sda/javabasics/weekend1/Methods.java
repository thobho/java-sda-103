package sda.javabasics.weekend1;

public class Methods {


  public static void main(String[] args) {
    int iWillBeMultipliedByTwo = 24;
    int resultFromMethod = multiplyByTwo(iWillBeMultipliedByTwo);
    System.out.println(resultFromMethod);

    int[] myArray = {1,2,3,4,5,6,3,45,6,7,4,8,98,9,6};
    int[] myArray2 = {1,2,34,4,555,6};
    int[] myArray3 = {1,24};

    printTable(myArray);
    printTable(myArray2);
    printTable(myArray3);

    int someResult = addIntegers(100, 300);

    System.out.println(someResult);

    int[] testMyMethod = {1,2,3,4,5,6,7};
    int[] modfiedArray = swapValuesInArray(testMyMethod, 3,10);
    printTable(modfiedArray);

  }

  static void printTable(int[] input){
    for (int i = 0; i < input.length; i++) {
      System.out.print("[" + input[i] + "]");
    }
    System.out.println();
  }


  static int multiplyByTwo(int input) {
    int result = input * 2;
    return result;
  }

  static int addIntegers(int a, int b) {
    int result = a + b;
    return result;
  }

  //[100,200,300,400], 0,2 => [300, 200, 100, 400]
  //[1,2,3,4,5,6,7], 0,6 => [7,2,3,4,5,6,1]

  static int[] swapValuesInArray(int[] array, int firstIndex, int secondIndex){

    int valueFromFirstIndex = array[firstIndex];
    int valueFromSecondIndex = array[secondIndex];

    array[firstIndex] = valueFromSecondIndex;
    array[secondIndex] = valueFromFirstIndex;

    return array;
  }

}
