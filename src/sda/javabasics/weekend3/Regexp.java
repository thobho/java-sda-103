package sda.javabasics.weekend3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
//https://regex101.com/
public class Regexp {

  public static void main(String[] args) {
    groups();
  }

  private static void groups() {
    Pattern pattern = Pattern.compile("(.*)(a[xyz]c)(test)");

    Matcher matcher = pattern.matcher("To jest jakiś text.azctest");

    matcher.find();

    String group1 = matcher.group(0);
    String group2 = matcher.group(1);
    String group3 = matcher.group(2);
    String group4 = matcher.group(3);

    System.out.println(group4);
  }

  private static void splitText() {
    Pattern pattern = Pattern.compile("a[xyz]c");
    String[] split = pattern.split("To jest jakiś text axc. Resta textu");
  }

  private static void findWithRegexp() {
    Pattern pattern = Pattern.compile("a[xyz]c");
    Matcher textMatcher = pattern.matcher("To jest jakiś text axc. Resta textu");

    boolean contains = textMatcher.find();

    System.out.println(contains);
  }

}
