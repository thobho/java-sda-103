package sda.javabasics.weekend2.demo;

//return from ifs and loops, overloading
public class Methods {


  public static void main(String[] args) {
    System.out.println("main start");

    print1(1000);

    System.out.println("main end");
  }

  static int print1(int x){
    System.out.println("print1 start");

    return print2(x);
  }

  static int print2(int x){
    System.out.println("print2 start");

    return x * x;
  }



















  static boolean findElementInArray(int[] arrayToSearch, int elemnt){
    for (int i = 0; i < arrayToSearch.length; i++) {
      if(elemnt == arrayToSearch[i]){
        return true;
      }
    }
    return false;
  }


  static String dayOfWeek(int n) {
    switch (n){
      case 1: return "poniedziłek";
      case 2: return "wtorek";
      default: return "nie wiem";
    }
  }

  static boolean isNumberGreat(int n) {
    if(n > 1000){
      return true;
    }

    return false;
  }

  static String takeDescriptionOfAge(int ageOfClient){
    int ageOfOld = 80;

    if(ageOfClient > ageOfOld){
      return "stary";
    } else {
      return "mlody";
    }
  }








  //1. Metoda, która nic nie przyjmuje jako paramaetr i nic nie zwraca
  static void method1() {
    System.out.println("Instrukcja");
    System.out.println("asda");
    System.out.println("ads");
    System.out.println("dasdasd");
  }

  //2. Metoda, która przyjmuje parametry, ale nic nie zwraca
  static void method2(int a, String b, boolean c) {

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
      if(i == 5){
        return;
      }
    }

  }


}
