package test;

public class Sample129a {

	public static void main(String[] args) {

		try {
		  
			int[] test;
			test = new int[4];

			System.out.println("Assign value to test[8]");

			test[8] = 4/0;
			System.out.println("Finished!!");
			
		} catch (ArithmeticException e) {
		  
			System.out.println("ZERO !!!.");
			
    } catch (ArrayIndexOutOfBoundsException e) {
      
      System.out.println("Out of array.");
      
		}

		System.out.println("End.");

	}

}
