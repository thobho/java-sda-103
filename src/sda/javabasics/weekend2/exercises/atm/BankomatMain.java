package sda.javabasics.weekend2.exercises.atm;

import java.util.Scanner;

public class BankomatMain {

  public static void main(String[] args) {

    Bankomat bankomat = createAtm();

    atmAlgorithm(bankomat);


  }

  private static Bankomat createAtm() {
    Client client1 = new Client("123", "4353", 129);
    Client client2 = new Client("124", "4354", 500);
    Client[] allClients = {client1, client2};
    Bankomat bankomat = new Bankomat(1000, allClients);
    return bankomat;
  }

  private static void atmAlgorithm(Bankomat bankomat) {
    Scanner scanner = new Scanner(System.in);

    Client clientForService = chooseClient(bankomat, scanner);

    if (clientForService == null) {
      return;
    }

    validatePin(bankomat, clientForService, scanner);

    //TODO

    scanner.close();
  }

  private static void validatePin(Bankomat bankomat, Client clientForService, Scanner scanner) {
    //Krok 2. Autoryzajca PINem
    System.out.println("Podaj PIN");
    String userInput = scanner.nextLine();
    boolean isPinCorrect = bankomat.isPinCorrect(clientForService, userInput);  //3445 (pin) ze Scannera

    if (isPinCorrect){
      System.out.println("Pin jest poprawny");
      //dalsze operacje
    } else {
      System.out.println("Pin jest niepoprawny");
    }
  }

  private static Client chooseClient(Bankomat bankomat, Scanner scanner) {
    //Krok 1. Ustalenie użytkownika
    System.out.println("Włóż kartę (wpisując numer):");
    String userInput = scanner.nextLine();

    Client clientForService = bankomat.putCard(userInput); //123 (parametr) ze Scannera

    System.out.println("Witaj!");
    System.out.println(clientForService);

    if(clientForService == null) {
      System.out.println("Nieprawidłowy numer klienta!");
      return null;
    }
    return clientForService;
  }

}
