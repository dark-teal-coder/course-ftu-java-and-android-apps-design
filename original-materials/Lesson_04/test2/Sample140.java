package test2;

public class Sample140 {

  public static void main(String[] args) {
    
    Car axe;
    axe = new Car();

    axe.color = "Lime";
    axe.doors = 4;
    axe.power = 99.95;
    axe.wheels = 3;
    
    System.out.println("Color: " + axe.color);
    System.out.println("doors: " + axe.doors);
    System.out.println("power: " + axe.power);
    System.out.println("wheels: " + axe.wheels);
  }

}
