package sda.javabasics.weekend3;

public class ObjectsRepetition {

  //"bolek", "lolek" -> ["BOLEK", "LOLEK"]


  static String[] joinStrings(String first, String second){
    String[] result = new String[2];
    result[0] = first.toUpperCase();
    result[1] = second.toUpperCase();
    return result;
  }


}
