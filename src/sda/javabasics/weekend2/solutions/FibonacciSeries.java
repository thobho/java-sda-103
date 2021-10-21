package sda.javabasics.weekend2.solutions;

public class FibonacciSeries {

  public static void main(String[] args) {
    printFibonacci(10); //what if big number
  }

  static void printFibonacci(int index){
    int n1=0;
    int n2=1;
    int n3;

    System.out.print(n1+" "+n2);//printing 0 and 1

    for(int i=2;i<index;++i){
      n3=n1+n2;
      System.out.print(" "+n3);
      n1=n2;
      n2=n3;
    }
  }

}
