package javaandroidappsdesign.lesson03;

public class Sample117 {
	public static void main(String[] args) {
		int i, j;
		
		for(i = 4; i >= 1; i--) {
			for(j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
	}
}