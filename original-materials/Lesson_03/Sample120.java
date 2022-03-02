package javaandroidappsdesign.lesson03;

public class Sample120 {
	public static void main(String[] args) {
		System.out.println("PI: " + Math.PI);
		
		System.out.println("sqrt(81): " + Math.sqrt(81));
		System.out.println("pow(8,9): " + Math.pow(8,9));
		System.out.println("ceil(6.4): " + Math.ceil(6.4));
		System.out.println("floor(6.4): " + Math.floor(6.4));
		System.out.println("round(1234.567): " + Math.round(1234.567));
		System.out.println("round(1234.432): " + Math.round(1234.432));
		System.out.println("random(): " + Math.random());
		
		// The java.lang.Math.random() method returns a double type number in the range [0, 1). 
		// (int) forces non-integer types to the integer type
		int num = (int) (Math.random() * 10); 
		System.out.println("Random no. between 0 and 9: " + num);
	}
}