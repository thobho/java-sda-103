package sda.javabasics.weekend1;

public class Variables {

  public static void main(String[] args) {

    //Teraz uczymy się zmiennych - to jest komentarz
    int myAge = 29; //<- gdzies w programie będziemy używac zmiennej (deklaracja zmniennej)
    myAge = 30; // <-   przupisanie (inizjalizacja zmiennej)
    System.out.println(myAge);
    myAge = 31;
    System.out.println(myAge);
    myAge = 203 + 19 * 12;

    int yourAge = 100;


    System.out.println(yourAge);

    myAge = 40;
    yourAge = 101;

    //System.out.println(myAge);

    //Typy zmiennych:
    //liczby całkowite
    byte someByte = 127;
    short someShort = 12213;
    int someInt = 347892;
    long someLong = 100000231;

    //liczby zmiennoprzecinkowe
    float someFloat = 1.3f;
    double someDouble = 123.42;


    //zmienne logczne
    boolean someBoolean = true;
    boolean someOtherBoolean = false;

    //zmienna znakowa
    char someChar = 'a';

    //typ String
    String someString = "To jest jakiś napis!";
  }

}
