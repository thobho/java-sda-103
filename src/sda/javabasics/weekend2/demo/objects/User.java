package sda.javabasics.weekend2.demo.objects;

class User {

  private String email;
  private String password;
  private int yearOfBirth;


  public User(String email, String password, int yearOfBirth) {

    if(email == null){
      //
    } else if(isEmailCorrect(email)){
      this.email = email;
    }



    this.password = password;

    if(yearOfBirth < 1900 || yearOfBirth > 2100){
      this.yearOfBirth = 0;
    } else {
      this.yearOfBirth = yearOfBirth;
    }

  }


  private boolean isEmailCorrect(String email){
    return email.indexOf("@") > 0;
  }

  public void setEmail(String newEmail) {
    if(isEmailCorrect(email)){
      this.email = newEmail;
    }else {
      System.out.println("!!!Email nie prawidlowy!!!");
    }
  }

  //gettery i settery
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  //toString

  public String toString() {
    return "User{" +
        "password='" + password + '\'' +
        ", email='" + email + '\'' +
        ", yearOfBirth=" + yearOfBirth +
        '}';
  }
}
