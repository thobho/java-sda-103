package sda.javabasics.weekend1;

public class Oparations {

  public static void main(String[] args) {

    //opearacja przypisanie / przepisania

    int someInt = 10;
    int someOtherInt;
    someOtherInt = someInt;
    System.out.println(someInt);
    System.out.println(someOtherInt);

    someOtherInt += someInt;
    someOtherInt -= someInt;
    someOtherInt *= someInt;
    someOtherInt /= someInt;

    //operacje arytemetyczne

    int a = 100;
    int b = 200;
    a = a + b;
    a = a - b;
    a = a * b;
    a = a / b;
    a = a % b;
    a = a ^ b; //potęgowanie: a do potęgi b

    System.out.println(a);
    System.out.println(b);


    //inkrementacja i dekrementacja (samodzielnie poszukaj jaka jest różnica)
    int c = 10;
    int d = --c;
    int e = ++c;
    int f = c++;
    int g = c--;

    //operatory porównania
     int x = 10;
     int y = 11;
     boolean areEquals = x == y;
     System.out.println("Czy x jest równy y: " + areEquals);

     boolean areXLowerThanY = x < y;
     boolean areXGreaterThanY = x > y;
     boolean areXLowerOrEqualThanY = x <= y;
     boolean areXGreaterOrEqualThanY = x >= y;



    char letterA = 'a';
    char otherLetter = (char) (letterA + 10);
    System.out.println(otherLetter);

    //zmiennoprzecinkowe

    double myWeight = 1;
    myWeight = myWeight / 3;
    System.out.println(myWeight);
    myWeight = myWeight * 3;
    System.out.println(myWeight);


    //operacje na booleanach

    boolean isWatherBeutyToday = true;
    boolean myDogNeedWalk = false;

    boolean shouldIGoWalk = isWatherBeutyToday && myDogNeedWalk; //&& - "i"

//    System.out.println(shouldIGoWalk);

    boolean iHaveGoodMeal = true;
    boolean iHaveGlassOfBeer = false;

    boolean iAmHappy = iHaveGoodMeal || iHaveGlassOfBeer; //|| - "lub"

//    System.out.println(iAmHappy);

    boolean myCarWorks = true;
    boolean myCarIsBroken = !myCarWorks;

    System.out.println(myCarWorks);
    System.out.println(myCarIsBroken);





    //
    String someString = "Ala ma kota. ";
    boolean startsWithAla = someString.startsWith("Ala");

    System.out.println(startsWithAla);


    String aString = "test";
    String bString = "test2";

    boolean areStringEquals = aString.equals(bString); // aString jest taki sam jak bString

  }
}
