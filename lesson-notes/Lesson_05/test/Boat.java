package test;

public class Boat {
  int seat;
  String color;
  
  void setSeat(int n) {
    seat = n;
  }
  
  void setColor(String c) {
    color = c;
  }
  
  void setSeatColor(int n, String c) {
    seat = n;
    color = c;
  }

  int getSeat() {
    return seat;
  }
  
  String getColor() {
    return color;  
  }
  
  void showInfo() {
    System.out.println("Info of the boat:");
    this.show();
  }
  
  void show() {
    System.out.println("Seat: " + seat);
    System.out.println("Color: " + color);    
  }

}
