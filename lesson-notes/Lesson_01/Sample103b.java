package javaandroidappsdesign.lesson01;

public class Sample103b {
	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 11;
		
		int result1 = num1 + num2;
		System.out.println("num1 + num2 = " + result1);
		
		int result2 = num1 - num2;
		System.out.println("num1 - num2 = " + result2);
		
		int result3 = num1 * num2;
		System.out.println("num1 * num2 = " + result3);
		
		// Narrowing type casting must be done manually by placing the type in parentheses in front of the value.
		double result4 = (double) num1 / num2;
	    System.out.println("num1 / num2 = " + result4);
	    
		System.out.println("num1 % num2 = " + num1 % num2);
	}
}