package sda.javabasics.weekend3.dog;


//1. Statyczne pole związane jest z klasą obiektów
//2. Pole instancyjne jest związane z konkretnym (wcześniej stworzonym obiektem)

//3. Pole statyncze istnieje nawet jak nie ma żadnej instancji obiektu
public class DogMain {


  public static void main(String[] args) {

    System.out.println(Dog.latinNameOfSpecies);



  }














  private static void staticFieldDemo() {
    Dog puszek = new Dog("Puszek", 50);
    System.out.println(puszek.name);
    System.out.println(puszek.latinNameOfSpecies);

    puszek.setName("Puchu");

    System.out.println(puszek.name);
    System.out.println(puszek.latinNameOfSpecies);

    Dog okruszek = new Dog("Okruszek", 1);
    okruszek.latinNameOfSpecies = "Canis okruszkus";

    System.out.println(puszek.name);
    System.out.println(puszek.latinNameOfSpecies);
  }

}
