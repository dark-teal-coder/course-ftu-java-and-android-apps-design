package test;

public class Boat {
  private int seat;
  private String color;

  public Boat() {
    seat = 2;
    color = "white";
    System.out.println("boat created");
  }
  
  public Boat(int n, String c) {
    seat = n;
    color = c;
  }

  public void setSeatColor(int n, String c) {
    seat = n;
    color = c;
  }

  public void show() {
    System.out.println("Seat: " + seat);
    System.out.println("Color: " + color);
  }
  public String toString() {
	    return "Seat: " + seat + ", Color: " + color;
  }

}
