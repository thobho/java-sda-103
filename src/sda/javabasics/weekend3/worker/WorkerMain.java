package sda.javabasics.weekend3.worker;

public class WorkerMain {

  public static void main(String[] args) {

    Worker.showWorkerClass();

    Worker w1 = new Worker();
    w1.showIds();

    System.out.println("============");

    Worker w2 = new Worker();
    w2.showIds();

    System.out.println("============");

    Worker w3 = new Worker();
    w3.showIds();
  }

}
