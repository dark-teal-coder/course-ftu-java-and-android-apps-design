package javaandroidappsdesign.lesson03;

public class Sample118a {
	public static void main(String[] args) {
		showstar(4);
		System.out.println("##----##----##");
		showstar(6);
		showstar(8);
		showstar('#');
	}
	
	public static void showstar(int num) {
		int i, j;
		
		for(i = num; i >= 1; i--) {
			for(j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
	}
	
	// Same method name but they accept different parameters
	public static void showstar(char sym) {
		int i, j;
		
		for(i = 4; i >= 1; i--) {
			for(j = i; j >= 1; j--)
				System.out.print(sym);
			System.out.println();
		}
	}
}