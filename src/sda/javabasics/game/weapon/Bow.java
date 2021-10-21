package sda.javabasics.game.weapon;

public class Bow {

  private Chord chord;
  private Stick stick;

  public Bow(){
    this.chord = new Chord();
    this.stick = new Stick();
  }

  public void shoot(){
    this.chord.useChord();
    System.out.println("Fruuuu! Strzała poleciała!");
  }

}
