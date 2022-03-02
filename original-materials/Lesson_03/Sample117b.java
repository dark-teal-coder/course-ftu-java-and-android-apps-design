package javaandroidappsdesign.lesson03;

public class Sample117b {
	public static void main(String[] args) {
		showstar();
		showstar();
		System.out.println("Happy New Year");
		showstar();
	}
	
	// For irregular pattern between groups of stars and statements: 
	public static void showstar() {
		int i, j;

		for(i = 4; i >= 1; i--) {
			for(j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
	}
}