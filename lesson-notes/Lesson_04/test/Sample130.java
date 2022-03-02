package test;

public class Sample130 {

  public static void main(String[] args) {

    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[1] = 4/0;
      System.out.println("Finished!!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of array.");
    } finally {
      System.out.println("MUST run this area.");
    }
    
    System.out.println("End.");
    
  }

}
