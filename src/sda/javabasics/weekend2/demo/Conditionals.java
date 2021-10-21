package sda.javabasics.weekend2.demo;

// ? :, switch
public class Conditionals {

  public static void main(String[] args) {

    int yourAge = 30;
    int ageOfOldMen = 80;

    boolean haveIHealthyKnees = false;

    String areYouOld = yourAge > ageOfOldMen ? "you are old men" : "you are young";

    System.out.println(areYouOld);

  }

  private static void conditnalExample() {
    String areYouOld;

    int yourAge = 30;
    int ageOfOldMen = 80;

    if(yourAge > ageOfOldMen) {
      areYouOld = "you are old men";
    } else {
      areYouOld = "you are young";
    }

    System.out.println(areYouOld);
  }


  static void switchDemo() {
    int dayOfWeek = 100;

    switch (dayOfWeek) {
      case 1: System.out.println("poniedzialek");
        break;
      case 2: System.out.println("wtorek");
        break;
      case 3: System.out.println("sroda");
        break;
      case 4: System.out.println("czwartek");
        break;
      case 5: System.out.println("piatek");
        break;
      case 6: System.out.println("sobota");
        break;
      case 7: System.out.println("niedziela");
      default:
        System.out.println("dzien nieznany");
    }
  }



}
