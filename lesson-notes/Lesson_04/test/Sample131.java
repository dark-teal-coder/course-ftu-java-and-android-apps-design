package test;

public class Sample131 {

  public static void main(String[] args) {

    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40;
      System.out.println("Finished!!");
    } catch (Exception e) {
      System.out.println("Out of array.");
      System.out.println("Error Message:" + e );
    }
    
    System.out.println("End.");
    
  }

}
