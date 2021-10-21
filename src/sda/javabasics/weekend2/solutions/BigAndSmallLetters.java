package sda.javabasics.weekend2.solutions;

public class BigAndSmallLetters {

  public static void main(String[] args) {
    System.out.println(bigAndSmall("Ala ma kota a kot ma alę"));
  }

  static String bigAndSmall(String text){
    var charArray = text.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
      var letter = charArray[i];
      if(i % 2 == 0 && isBigLetter(letter)){
        charArray[i] = makeSmallLetter(letter);
      }
      if(i % 2 != 0 && isSmallLetter(letter)){
        charArray[i] = makeBigLetter(letter);
      }
    }

    return String.valueOf(charArray);
  }

  static char makeSmallLetter(char bigLetter){
    return (char) (bigLetter + 32);
  }

  static char makeBigLetter(char smallLetter){
    return (char) (smallLetter - 32);
  }

  static boolean isSmallLetter(char letter){
    return letter >= 96 && letter <=122;
  }

  static boolean isBigLetter(char letter){
    return letter >= 65 && letter <= 90;
  }
}
