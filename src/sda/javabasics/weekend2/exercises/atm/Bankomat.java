package sda.javabasics.weekend2.exercises.atm;

public class Bankomat {

  private double totalAmount;
  private Client[] clients;

  public Bankomat(double totalAmount, Client[] clients) {
    this.totalAmount = totalAmount;
    this.clients = clients;
  }

  public Client putCard(String accountNumber){
    for (int i = 0; i < clients.length; i++) {
      if(clients[i].getAccountNumber().equals(accountNumber)){
        return clients[i];
      }
    }
    return null;
  }

  //da się to skrócić do jednej linijki
  public boolean isPinCorrect(Client client, String userPinInput) {
    if(client.getPinNumber().equals(userPinInput)){
      return true;
    } else {
      return false;
    }
  }






}
