package sda.javabasics.weekend2.solutions.students.atm;

public class Bankomat {

  private double totalAmount;
  private Client[] clients;

  public Bankomat(double totalAmount, Client[] clients) {
    this.totalAmount = totalAmount;
    this.clients = clients;
  }

  public Client putCard(String accountNumber){
    for(int i = 0; i < clients.length ; i++){
      if (clients[i].getAccountNumber().equals(accountNumber)){
        return clients[i];
      }
    }
    return null;
  }

  public boolean isPinCorrect(Client client, String userPinInput) {
    if(client.getPinNumber().equals(userPinInput)){
      return true;
    }else{
      return false;        }

  }


  public void printList(){
    System.out.println( "Wybierz jedną z opcji"+
        "\n  1. Stan konta" +
        "\n  2. Wypłata" +
        "\n  3. Wpłata " +
        "\n  4. Wypłata kwoty 100.00"+
        "\n  0. Wyjmij kartę");
  }

  public double checkBalance(Client client){
    return client.getAccountState();
  }

  public boolean isWithdrawPossible(Client client, double amt){
    if (checkBalance(client)>=amt){
      return true;
    }else return false;

  }

  public void wyplata(Client client, double amt){
    if (isWithdrawPossible(client,amt)){
      client.setAccountState(checkBalance(client) - amt);
    }

  }

  public void wplata(Client client, double amt){
    client.setAccountState(checkBalance(client)+amt);
  }



}
