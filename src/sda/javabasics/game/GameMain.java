package sda.javabasics.game;

import sda.javabasics.game.character.Elf;

public class GameMain {

  public static void main(String[] args) {
    Elf elf = new Elf("Legolas");

    elf.introduceYourself();

    elf.useWeapon();


  }
}
