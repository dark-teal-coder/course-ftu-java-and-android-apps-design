package test;

public class Sample124 {

  public static void main(String[] args) {
    double total1, total2;

    total1 = sum(5.0, 10.0, 15.0); 
    total2 = sum(5.0, 10.0, 15.0, 20.0);

    System.out.println("Sum of 3 numbers: " + total1);
    System.out.println("Sum of 4 numbers: " + total2);
  }

  
  public static double sum(double ... numbers) {
    double total = 0.0;

    for (double x : numbers) { 
      total += x;
    }

    return total;
  }

}
