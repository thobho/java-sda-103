package sda.javabasics.weekend3;

public class BitwiseVsBooleanOperators {


  public static void main(String[] args) {

    boolean a = true;
    boolean b = false;
    boolean c = a && b;
    boolean d = a || b;


    //===================
    //UWAGA, TO NIE TO SAMO
    //===================

    int x = 4;  //0100
    int y = 8;  //1000
                //1100
    int z = y | x;
    int z2 = y & x;
    System.out.println(z);

  }

}
