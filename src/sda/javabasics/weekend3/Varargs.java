package sda.javabasics.weekend3;

public class Varargs {

  public static void main(String[] args) {

    String[] names = {};
    System.out.println(printHelloManyNameWithArray("Hej! ", names));

  }



  static String printHelloManyName(String text, String... names){
    for (int i = 0; i < names.length; i++) {
      text += names[i];
    }
    return text;
  }

  static String printHelloManyNameWithArray(String text, String[] names){
    for (int i = 0; i < names.length; i++) {
      text += names[i];
    }
    return text;
  }














  static String printHello(String text, String name1, String name2){
    return text + name1 + name2;
  }

  static double add(double... doubles) {
    double sum = 0.0;
    for (int i = 0; i < doubles.length; i++) {
      sum += doubles[i];
    }
    return sum;
  }


}
