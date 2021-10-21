package sda.javabasics.weekend2.demo.objects;

public class Car {

  private int x; //góra - dół
  private int y; //prawo - lewo

  void moveRight(){
    this.y--;
  }

  void moveLeft(){
    this.y++;
  }

  void moveUp(){
    this.x--;
  }

  void moveDown(){
    this.x++;
  }


  void showLocalisation(){
    int maxHeight = 20;
    int maxWeight = 20;
    
    for (int i = 0; i < maxHeight; i++) {
      for (int j = 0; j < maxWeight; j++) {
        if(this.x + 10 == i && this.y + 10 == j){
          System.out.print("[]");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
