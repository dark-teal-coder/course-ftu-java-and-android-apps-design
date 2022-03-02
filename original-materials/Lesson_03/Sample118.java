package javaandroidappsdesign.lesson03;

public class Sample118 {
	public static void main(String[] args) {
		showstar(4);
		System.out.println("##----##----##");
		showstar(6);
		showstar(2);
	}
	
	public static void showstar(int num) {
		int i, j;
		
		for(i = num; i >= 1; i--) {
			for(j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
	}
}