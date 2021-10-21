package sda.javabasics.weekend1;

public class Loops {

  public static void main(String[] args) {

    int intToPrint = 0;

    while(intToPrint < 10){
      intToPrint = intToPrint + 1;
      if(intToPrint % 2 == 0) {
        System.out.println(intToPrint);
      }
    }

    System.out.println("===============");
    System.out.println("W tym miejscu watośc zmiennej intToPrint jest równa 10, ale wchodzimy do bloku `do`. Dlaczego???");
    do {
      intToPrint = intToPrint + 1;
      System.out.println(intToPrint);
    } while (intToPrint < 10);




  }
}
