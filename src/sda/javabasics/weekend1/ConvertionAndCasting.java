package sda.javabasics.weekend1;

public class ConvertionAndCasting {


  public static void main(String[] args) {

    //Automatyczna konwersja z int -> float
    int hundred = 100;
    float floatHundred = hundred;
    System.out.println(hundred);
    System.out.println(floatHundred);

    //Automatyczna konwersja z int -> long
    long x = 10;
    int y = 20; //y int -> long
    long z = x + y;

    //Automatyczna konwersja z float -> double
    float a = 1.4F;
    double b = 1.7;
    System.out.println(a+b);

    //Ręczne rzutowanie z double na int
    double g = 0.6666;
    double h = 0.6666;
    int someNumber;
    someNumber = (int)(g + h);
    System.out.println(someNumber);

    //Przydatne statyczne funkcje z klasy math
    double random = Math.random(); //liczba lososwa
    int abs = Math.abs(-101); //wartośc absolutna
    int rounded = Math.round(1.4f); //zaokraglenie liczby

  }

}
