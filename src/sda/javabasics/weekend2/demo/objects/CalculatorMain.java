package sda.javabasics.weekend2.demo.objects;

public class CalculatorMain {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int add1 = calculator.add(123, 434);

    int add2 = calculator.add(123.4, 434.3);

    System.out.println(add1);
    System.out.println(add2);

  }

}
