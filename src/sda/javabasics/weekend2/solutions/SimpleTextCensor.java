package sda.javabasics.weekend2.solutions;

public class SimpleTextCensor {

  public static void main(String[] args) {

    System.out.println(censorWords("To jest brzydal i ochyda !!!"));

  }

  static String censorWords(String text) {
    String[] forbiddenWords = {"brzydal", "ochyda", "szlag"};

    for (int i = 0; i < forbiddenWords.length; i++) {
      text = text.replace(forbiddenWords[i], "XXXXXX");
    }

    return text;
  }

}
