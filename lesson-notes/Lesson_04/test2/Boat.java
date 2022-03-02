package test2;

public class Boat {
  int seat;
  String color;
  
  void show() {
    System.out.println("Seat: " + seat);
    System.out.println("Color: " + color);    
  }
  
  void showInfo() {
    System.out.println("Info of the boat:");
    this.show();
  }
  
  void setSeat(int n) {
    seat = n;
  }
  
  void setColor(String c) {
    color = c;
  }
}
