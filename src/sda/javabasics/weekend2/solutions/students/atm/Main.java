package sda.javabasics.weekend2.solutions.students.atm;


import java.util.Scanner;

//Tozwiązanie Marcina: https://github.com/fluffgit/ATM-test/blob/main/Main.java
public class Main {
  public static void main(String[] args) {

    Client client1 = new Client("123", "4353", 1290);
    Client client2 = new Client("124", "4354", 5000);
    Client[] allClients = {client1, client2};
    Bankomat bankomat = new Bankomat(1000, allClients);
    System.out.println("Włóż kartę:");

    //Krok 1. Ustalenie użytkownika
    Client clientForService = bankomat.putCard("123");
    System.out.println("Witaj!");
    System.out.println(clientForService.getPinNumber());

    //Krok 2. Autoryzajca PINem
    System.out.println("Podaj PIN");
    Scanner scanner = new Scanner(System.in);

    String userinput1 = scanner.nextLine();
    boolean isPinCorrect = bankomat.isPinCorrect(clientForService, userinput1);

    if (!isPinCorrect) {
      System.out.println("Pin jest niepoprawny");

    } else {
      System.out.println("Pin jest poprawny");
      Scanner scanner2 = new Scanner(System.in);
      boolean isRunning = true;
      while (isRunning) {
        bankomat.printList();
        String choice = scanner2.nextLine();
        String amt = "";
        switch (choice) {
          case "1":
            System.out.println("Stan konta");
            System.out.printf(String.format("Stan konta: %.2f\n", bankomat.checkBalance(clientForService)));
            break;
          case "2":
            System.out.println("Podaj kwotę do wyplaty");
            if (scanner2.hasNextLine()) {
              amt = scanner2.nextLine();

              if (bankomat.isWithdrawPossible(clientForService, Double.parseDouble(amt))) {
                bankomat.wyplata(clientForService, Double.parseDouble(amt));
                System.out.printf(String.format("Kwota wypłacona: %s, Stan konta: %.2f\n", amt, bankomat.checkBalance(clientForService)));
              } else {
                System.out.printf(String.format("Nie można wyplacić kwoty: %.2s\n", amt));
                System.out.printf(String.format("Stan konta: %.2f\n", bankomat.checkBalance(clientForService)));
              }
            }
            break;
          case "3":
            System.out.println("Podaj kwotę do wpłaty");
            if (scanner2.hasNextLine()) {
              amt = scanner2.nextLine();
              bankomat.wplata(clientForService, Double.parseDouble(amt));
              System.out.printf(String.format("Stan konta: %.2f\n", bankomat.checkBalance(clientForService)));
            }
            break;
          case "4":
            System.out.println("wypłata kwoty 100.00");

            String amt2 = "100";
            if (bankomat.isWithdrawPossible(clientForService, Double.parseDouble(amt2))) {
              bankomat.wyplata(clientForService, Double.parseDouble(amt2));
              System.out.printf(String.format("Kwota wypłacona: %s, Stan konta: %.2f\n", amt2, bankomat.checkBalance(clientForService)));
            } else {
              System.out.printf(String.format("Nie można wyplacić kwoty: %s\n", amt2));
              System.out.printf(String.format("Stan konta: %.2f\n", bankomat.checkBalance(clientForService)));
            }

            break;
          case "0":
            System.out.println("zakoncz");
            isRunning = false;
            break;
          default:
            System.out.println("zły wybór");
            break;
        }
      }
      scanner2.close();
    }
  }
}


