package test;

public class Sample124a {

  public static void main(String[] args) {
    double total1, total2;

    total1 = sumx(); 
    total2 = sumx(2, 6, 15.0, 20.0);

    System.out.println("Sum of 3 numbers: " + total1);
    System.out.println("Sum of 4 numbers: " + total2);
  }

  
  public static double sumx(double ... numbers) {
    double total = numbers.length == 0 ? 0 : 1.0;

    for (double x : numbers) { 
      total *= x;
    }

    return total;
  }

}
