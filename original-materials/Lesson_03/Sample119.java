package javaandroidappsdesign.lesson03;

public class Sample119 {
	public static int sumBetween(int first, int last) {
		int i, total = 0;
		
		for(i = first; i <= last; i++)
			total += i;
		
		return total;
	}
	
	public static double celciusToF(double c) {
		return (c * 1.8 + 32.0);
	}
	
	public static void main(String[] args) {
		// Return total = 0 if the order is from larger to smaller
		System.out.println("Total: " + sumBetween(4, 8)); 
		System.out.println("Value: " + celciusToF(33));
	}
}