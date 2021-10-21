package sda.javabasics.weekend2.solutions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CensorMain {

  public static final String FILE_PATH = "C:\\Users\\Kamil\\Desktop\\java\\polskieprzeklenstwa.txt";

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Witaj w Cenzor ver.1.0");
    final Set<String> badWords = readFile();
    Scanner scanner = new Scanner(System.in);

    final boolean shouldLoadText = shouldLoadText(scanner);
    if (shouldLoadText) {
      final String userText = getUserText(scanner);
      prepareText(userText,badWords);
    }
    scanner.close();
  }

  private static Set<String> readFile() {
    try {
      final BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
      return bufferedReader.lines()
          .collect(Collectors.toSet());
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Nie znaleziono pliku");
    }
  }

  private static boolean shouldLoadText(Scanner scanner) {
    System.out.println("Wybierz funkcje programu:\n1- Włącz sprawdzanie tekstu\n2- Wyłącz program");
    int option = scanner.nextInt();
//        while (option != 1 || option != 2) {
//            final String value = scanner.nextLine();
//            try {
//                final int intValue = Integer.parseInt(value);
//                if (intValue == 1 || intValue == 2) {
//                    option = intValue;
//                } else {
//                    System.out.println("Dostępne opcje 1 lub 2");
//                }
//            } catch (Exception exception) {
//                System.out.println("Nie poprawna wartość, spróbuj jeszcze raz");
//            }
//        }
    return option == 1;
  }


  private static String getUserText(Scanner scanner) {
    System.out.println("Podaj tekst, który chcesz ocenzurować");
    String userText = scanner.nextLine();
    while (userText.isBlank()) {
      System.out.println("Zdanie nie powinno być puste. Spróbuj ponownie");
      userText = scanner.nextLine();
    }
    return userText;
  }

  private static void prepareText(String text, Set<String>badWords) {
    final String[] split = text.split(" ");
    for (String word : split) {
            /*
            word pojedyńcze słowo
            split jest zbiorem przekleństw
             */
      final String result;
      if (badWords.contains(word)) {
        result = "###";
      } else {
        result = word;
      }
      System.out.print(result + " ");
    }
  }
}