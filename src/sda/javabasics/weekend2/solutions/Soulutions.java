package sda.javabasics.weekend2.solutions;

import java.util.Arrays;

//Rozwiązania Marcina L. do zadań z poprzedniego weekendu
public class Soulutions {

  public static void main(String[] args) {

    int[] tab = {1, 2, 3, 4, 5, 6, 7};
    String[][] tab2 = new String[10][10];
    String[][] tab3 = new String[11][11];
//
//        // # obowiązkowe #
//        // ## zad 1 ##
//        System.out.println(silnia(6));
//
//        // ## zad 2 ##
//        trojkat5(8);
//
        // ## zad 3 ##
        System.out.println(sumaTablicy(tab));
//
//        // ## zad 4 ##
//        czyLiczbaWTabliczy(tab,5);
//
//        // ## zad 5 ##
//        wypełnijTablice(tab2);
//
//        // # dodatkowe #
//         tabliczkaMozenia(tab3);
//        tabliczkaMozenia2(tab3);
//        // ## drukowanie wzorów ##
//        trojkat1(8);
//        trojkat2(8);
//        trojkat3(8);
//        trojkat4(8);
//        klepsydra(8);
//        kwadrat(8);
//        kwadratPrzekatne(8);
//        literaZ(8);
//        literaS(8);
//        choinka(8);
//        choinka2(8);
//
//        // ## dodatkowe nie wzory ##
//        przemnozString("27648");
//        // ## przemnozStringReturnInt w class Reducer ##
//        alfabet();
//
//        // # kalendarz #
//    String[][] miesiac = new String[6][7];
//    drukujKalendarz(miesiac, 4);


  }


  // zad 1
  public static int silnia(int i) {
    System.out.println("\n oblicz silnię z: " + i);
    int wynik = 1;
    while (i > 1) {
      wynik *= i;
      i--;
    }
    return wynik;
  }

  //zad 2
  //?


  //zad 3
  public static int sumaTablicy(int[] tablica) {
    System.out.println("\n suma elementów tablicy");
    int i = 0;
    int suma = 0;
    int rozmiarTab = tablica.length;
    while (rozmiarTab > 0) {
      suma += tablica[i];
      rozmiarTab--;
      i++;
    }
    return suma;
  }

  //zad 4
  public static void czyLiczbaWTabliczy(int[] tablica, int szukana) {
    System.out.println("\n Sprawdź czy liczba  w tablicy");
    System.out.println(Arrays.toString(tablica));
    int rozmiar = tablica.length;
    int i = 0;
    boolean j = false;
    while (rozmiar > 0) {
      if (szukana == tablica[i]) {
        System.out.println(tablica[i] + " jest w tablicy");
        j = true;
      }
      rozmiar--;
      i++;
    }
    if (rozmiar == 0 && !j) {
      System.out.println(szukana + " nie jest w tablicy");
    }
  }

  //zad 5
  public static void wypełnijTablice(String[][] tab) {
    System.out.println("\n wypełnij tablice");
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[i].length; j++) {
        tab[i][j] = String.format("%3s", i * j);
        System.out.printf(tab[i][j]);
      }
      System.out.println();
    }
  }

  public static void tabliczkaMozenia(String[][] tab) {
    System.out.println("\n tabliczka bez obramowania");
    for (int i = 1; i < tab.length; i++) {
      for (int j = 1; j < tab[i].length; j++) {
        tab[i][j] = String.format("%4s", i * j);
        System.out.printf(tab[i][j]);
      }
      System.out.println();
    }
  }

  public static void tabliczkaMozenia2(String[][] tab) {
    System.out.println("\n tabliczka z obramowaniem");
    System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    for (int i = 1; i < tab.length; i++) {
      for (int j = 1; j < tab[i].length; j++) {

        if (i * j > 99) {
          tab[i][j] = String.format("%5s", "| " + i * j + " ");
        } else if (i * j > 9) {
          tab[i][j] = String.format("%5s", "| 0" + i * j + " ");
        } else {
          tab[i][j] = String.format("%5s", "| 00" + i * j + " ");
        }

        System.out.printf(tab[i][j]);
      }
      System.out.printf("|");
      System.out.println("\n+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");

    }
  }

  public static void trojkat1(int n) {
    System.out.println("\n wzór trójkąt 1");
    int i;
    int j;
    for (i = 0; i < n; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("# ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void trojkat2(int n) {
    System.out.println("\n wzór trójkąt 2");
    int i;
    int j;
    for (i = n; i + 1 > 1; i--) {
      for (j = 0; j <= i - 1; j++) {
        System.out.print("# ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void trojkat4(int n) {
    System.out.println("\n wzór trójkąt 4");
    int i;
    int j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j < i; j++) {
        System.out.print("  ");
      }
      for (j = i; j <= n; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }

    System.out.print("\n");
  }

  public static void trojkat3(int n) {
    System.out.println("\n wzór trójkąt 3");
    int i;
    int j;
    for (i = n; i + 1 > 1; i--) {
      for (j = 1; j < i; j++) {
        System.out.print("  ");
      }
      for (j = i; j <= n; j++) {
        System.out.print("# ");
      }
      System.out.print("\n");
    }

    System.out.print("\n");
  }

  public static void klepsydra(int n) {
    System.out.println("\n wzór klepsydra");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i + j == n + 1 || j == i || i == 1 || i == n) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void przekatne(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i + j == n + 1 || j == i) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void kwadrat(int n) {
    System.out.println("\n wzór kwadrat");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void literaS(int n) {
    System.out.println("\n wzór itera S");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == i || i == 1 || i == n) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void literaZ(int n) {
    System.out.println("\n wzór Litera Z");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i + j == n + 1 || i == 1 || i == n) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void kwadratPrzekatne(int n) {
    System.out.println("\n wzór kwadrat i przekątne");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i + j == n + 1 || j == i || i == 1 || i == n || j == 1 || j == n) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void przemnozString(String s) {
    System.out.println("\nmnozenie cyfr w stringu");
    int suma = 1;
    int rozmiar = s.length();
    int i = 0;
    while (rozmiar > 0) {
      suma *= Integer.parseInt(String.valueOf(s.charAt(i)));
      i++;
      rozmiar--;
    }
    System.out.println(suma);
  }

  public static void alfabet() {
    System.out.println("\nalfabet");
    for (int i = 65; i <= 122; i++) {
      if ((i >= 65 && i <= 90) || (i > 96 && i <= 122)) {
        System.out.print((char) i + ", ");
      }
    }
    System.out.println("");
  }

  public static void choinka(int n) {
    System.out.println("\nchoinka");
    int i;
    int j;
    for (i = n; i + 1 > 1; i--) {
      for (j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (j = i; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

  public static void choinka2(int n) {
    System.out.println("\nchoinka z bombkami");
    int i;
    int j;
    for (i = n; i + 1 > 1; i--) {
      for (j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (j = i; j <= n; j++) {
        int bombka = (int) (Math.random() * (10 - 2));
        if (i == bombka) {
          System.out.print("o ");
        } else
          System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

  public static void trojkat5(int n) {
    System.out.println("\nwzór trójkąt ob2");
    int i;
    int j;
    for (i = 0; i < n; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  public static void drukujKalendarz(String[][] miesiac, int iloscDniDoOminiecia) {
    System.out.println("\nkalendarz");
    int licznikDniDoOminiecia = 1;
    int licznikDni = 1;
    int ostatnidzienMiesiaca = 29;
    String[] dni = {"po", "wt", "śr", "cz", "pt", "so", "nd"};
    for (int z = 0; z < dni.length; z++) {
      System.out.printf(String.format("%3s", dni[z]));
    }
    System.out.println("\nXXXXXXXXXXXXXXXXXXXXXX");
    if (iloscDniDoOminiecia >= 0 && iloscDniDoOminiecia < 7) {
      for (int i = 0; i < miesiac.length; i++) {
        for (int j = 0; j < miesiac[i].length; j++) {
          if (licznikDniDoOminiecia <= iloscDniDoOminiecia) {
            miesiac[i][j] = String.format("%3s", "");
            System.out.printf(miesiac[i][j]);
            licznikDniDoOminiecia++;
          } else if (licznikDni <= ostatnidzienMiesiaca) {
            miesiac[i][j] = String.format("%3s", licznikDni);
            System.out.printf(miesiac[i][j]);
            licznikDni++;
          }
        }
        System.out.println();
      }
    } else {
      System.out.println("Błędny dzień startu");
    }
  }


}
