package test;

public class Sample223 {

  public static void main(String[] args) {

    Boat[] boats;
    boats = new Boat[2];

    boats[0] = new Boat();
    boats[1] = new QuickBoat();

    for ( int i=0; i < boats.length ; i++){
      System.out.println("boat[" + i + "] is '" + boats[i].getClass() + "' class.");
    }

  }

}
