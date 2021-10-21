package sda.javabasics.weekend1;

public class Conditionals {
  public static void main(String[] args) {


    //0 - 1 -> niemowlak
    //1 - 10 -> dziecko
    //10 - 18 -> młodzieniec
    //18 - 80 -> pełnoletni
    // > 80 -> stary

    //dane wejsciowe
    int myAge = 1;

    if (myAge ==  0 || myAge == 1) {
      System.out.println("niemowlak");
    } else if(myAge >= 1 && myAge <= 10) {
      System.out.println("dziecko");
    } else if(myAge > 10 && myAge < 18) {
      System.out.println("młodzieniec");
    } else if (myAge >= 18 && myAge < 80) {
      System.out.println("pełnoletni");
    } else {
      System.out.println("stary");
    }


    if (myAge ==  0 || myAge == 1) {
      System.out.println("niemowlak");
    }
    if(myAge >= 1 && myAge <= 10) {
       System.out.println("dziecko");
    }
    if(myAge > 10 && myAge < 18) {
      System.out.println("młodzieniec");
    }
    if (myAge >= 18 && myAge < 80) {
      System.out.println("pełnoletni");
    }


    String[] daysOfWeek = {"pon", "wt", "sr", "cz", "pt", "sb", "nd"};

    int numberOfDay = 1;
    if(numberOfDay == 1) {
      System.out.println("poniedziałek");
    } else if(numberOfDay == 2) {
      System.out.println("wtorek");
    } else if(numberOfDay == 3) {
      System.out.println("sroda");
    } else if(numberOfDay == 4) {
      System.out.println("czwartek");
    } else if(numberOfDay == 5) {
      System.out.println("piatek");
    } else if(numberOfDay == 6) {
      System.out.println("sobota");
    } else if(numberOfDay == 7) {
      System.out.println("niedziela");
    } else {
      System.out.println("nie wiadomo jaki dzien");
    }

  }
}
