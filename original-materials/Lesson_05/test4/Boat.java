package test4;

public class Boat {
  private int seat;
  private String color;

  public Boat() {
    seat = 2;
    color = "white";
    System.out.println("boat created");
  }

  public void setSeatColor(int n, String c) {
    seat = n;
    color = c;
  }

  public void show() {
    System.out.println("Seat: " + seat);
    System.out.println("Color: " + color);
  }

}
