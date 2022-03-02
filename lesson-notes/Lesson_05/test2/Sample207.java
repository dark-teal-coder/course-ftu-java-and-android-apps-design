package test2;

public class Sample207 {

  public static void main(String[] args) {

    Boat boat1 = new Boat();

    boat1.setSeatColor(18, "lime");
    boat1.show();

    System.out.println("\nTry to set wrong seat data ...\n");

    boat1.setSeatColor(10, "orange");
    boat1.show();

  }

}
