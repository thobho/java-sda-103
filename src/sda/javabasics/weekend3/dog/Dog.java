package sda.javabasics.weekend3.dog;

public class Dog {

  public static String latinNameOfSpecies = "Canis lupus familiaris";

  public String name;
  private double weight;

  public Dog(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        '}';
  }
}
