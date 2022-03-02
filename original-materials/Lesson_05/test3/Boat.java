package test3;

public class Boat {
  private int seat;
  private String color;
  
  public Boat() {
    seat = 2;
    color = "white";
    System.out.println("boat created.");
  }
  
  public Boat(int n, String c) {
    this();
    setSeatColor(n, c);
  }
  
  public void setSeat(int n) {
    setSeatColor(n, color);
  }
  
  public void setColor(String c) {
    setSeatColor(seat, c);
  }
  
  public void setSeatColor(int n, String c) {
    if (n > 0 && n < 99){
      seat = n;
      color = c;
    } else {
      System.out.println("[" + n + "] <-invalid seat data.");
      System.out.println("cannot change seat data.");
    }
  }

  public void setSeatColor(int n) {
    setSeatColor(n, color);
  }

  public void setSeatColor(String c) {
    setSeatColor(seat, c);
  }

  public int getSeat() {
    return seat;
  }
  
  public String getColor() {
    return color;  
  }
  
  public void showInfo() {
    System.out.println("Info of the boat:");
    this.show();
  }
  
  public void show() {
    System.out.println("Seat: " + seat);
    System.out.println("Color: " + color);    
  }

}
