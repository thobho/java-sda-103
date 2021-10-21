package sda.javabasics.weekend3;

public class PrimitiveWrapper {


  public static void main(String[] args) {
    int x = 10;
    Integer y = Integer.valueOf(10);
    boolean areIntsEquals = x == y; //unboxing

    System.out.println(areIntsEquals);

    boolean b1 = false;
    Boolean v2 = Boolean.valueOf("false");

    double double1 = 1.3;
    Double double2 = Double.valueOf("1.3");
  }

}
