package sda.javabasics.weekend3.worker;

public class Worker {

  private static int idCounter = 0;

  private int id;

  public Worker() {
    this.id = Worker.idCounter;
    idCounter++;
  }

  public void showIds(){
    System.out.println("Id workera: " + this.id);
    System.out.println("Counter: " + Worker.idCounter);
  }

  public static void showWorkerClass(){
    System.out.println("Jestem klasą Worker");
  }

  @Override
  public String toString() {
    return "Worker{" +
        "id=" + id +
        '}';
  }
}
