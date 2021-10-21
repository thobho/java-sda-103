package sda.javabasics.weekend2.exercises.atm;

public class Client {

  private String accountNumber;
  private String pinNumber;

  private double accountState;

  public Client(String accountNumber, String pinNumber, double accountState) {
    this.accountNumber = accountNumber;
    this.pinNumber = pinNumber;
    this.accountState = accountState;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getPinNumber() {
    return pinNumber;
  }

  public void setPinNumber(String pinNumber) {
    this.pinNumber = pinNumber;
  }

  public double getAccountState() {
    return accountState;
  }

  public void setAccountState(double accountState) {
    this.accountState = accountState;
  }

  @Override
  public String toString() {
    return "Client{" +
        "accountNumber='" + accountNumber + '\'' +
        ", pinNumber='" + pinNumber + '\'' +
        ", accountState=" + accountState +
        '}';
  }
}
