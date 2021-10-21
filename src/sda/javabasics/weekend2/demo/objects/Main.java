package sda.javabasics.weekend2.demo.objects;

public class Main {

  public static void main(String[] args) {


    Cup cup1 = new Cup(100);
    Cup cup2 = new Cup(500);

    int volumOfCupOne = cup1.getVolumeInMililters();
    int volumOfCupTwo = cup2.getVolumeInMililters();

    System.out.println(volumOfCupOne + volumOfCupTwo);

  }

}
