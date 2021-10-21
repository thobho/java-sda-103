package sda.javabasics.weekend2.demo;

import java.util.Scanner;

public class StringsAndChars {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj liczbę a:");
    int a = scanner.nextInt();

    System.out.println("Podaj liczbę b:");
    int b = scanner.nextInt();

    int c = a + b;

    System.out.printf("Wynik dodawania a + b = %d", c);
    scanner.close();




  }

  static void stringMethods(){

    String text = "Ala ma kota, a kot ma ale";

    String str = "testString";
    char[] charArray = str.toCharArray();

  }

  static void stringFormatting(){
    String hello = "HelloWorld";

//      System.out.printf("|%s| %n", hello);
//      System.out.printf("|%30s| %n", hello);
//      System.out.printf("|%-30s| %n", hello);
//      System.out.printf("|%.5s| %n", hello);
//      System.out.printf("|%30.5s| %n", hello);
//      System.out.printf("|%-30.5s| %n", hello);
//      System.out.printf("%n", hello);



//    long n = 123461012;
//    System.out.format("%d %n", n);      //  -->  "461012"
//    System.out.format("%012d %n", n);    //  -->  "00461012"
//    System.out.format("|%12d| %n", n);    //  -->  "|  461012|"
//    System.out.format("|%-12d| %n", n);    //  -->  "|461012  |"
//    System.out.format("%,8d %n", n);    // -->  " 461,012"
//    System.out.format("%+,8d %n%n", n); //  -->  "+461,012"
//
    double pi = Math.PI;

    System.out.format("%f %n", pi);       // -->  "3.141593"
    System.out.format("%.3f %n", pi);     // -->  "3.142"
    System.out.format("%10.7f %n", pi);   // -->  "     3.142"
    System.out.format("%-10.3f %n", pi);  // -->  "3.142"
  }


}
