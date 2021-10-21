package sda.javabasics.game.character;


import sda.javabasics.game.weapon.Bow;

public class Elf {

  private String name;
  private Bow weapon;

  public Elf(String name) {
    this.name = name;
    this.weapon = new Bow();
  }

  public void introduceYourself(){
    System.out.println("Hej! Jestem eflem. Nazywam sie: " + name);
  }

  public void useWeapon(){
    this.weapon.shoot();
  }

}
