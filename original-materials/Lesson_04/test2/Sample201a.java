package test2;

public class Sample201a {

  public static void main(String[] args) {

    Boat boat1 = new Boat();
    Boat happy = new Boat();

    boat1.seat = 12;
    boat1.color = "navy";

    boat1.show();
    
//    System.out.println("Seat: " + boat1.seat);
//    System.out.println("Color: " + boat1.color);
    
    happy.seat = 100;
    happy.color = "yellow";

    happy.show();
//    System.out.println("Seat: " + happy.seat);
//    System.out.println("Color: " + happy.color);
    
  }

}
