package sda.javabasics.weekend2.demo.objects;

class Cup {

  //stan klasy - czyli co kubek "ma"
  //>>this<<
  int volumeInMililters;
  String color;
  boolean hasHolder;

  //sposób jak stworzyć konkretny kubek
  Cup(int howBigIsYourCup){
    this(howBigIsYourCup, "blue", true);
  }

  Cup(int volumeInMililters, String color, boolean hasHolder) {
    this.volumeInMililters = volumeInMililters;
    this.color = color;
    this.hasHolder = hasHolder;
  }

  //zachowania klasy (wszsytko co nizej), czyli co "potrafi robić"

  void setColor(String newColor) {
    this.color = newColor;
  }

  int getVolumeInMililters() {
    return this.volumeInMililters;
  }


  public String toString() {
    return String.format("Jestem kubkiem. Mam pojemnosc: %d ml. Kolor: %s. Uchwyt: %b", this.volumeInMililters, this.color, this.hasHolder);
  }

}
