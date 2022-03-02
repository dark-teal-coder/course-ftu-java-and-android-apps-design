package javaandroidappsdesign.lesson03;

public class Sample117a {
	public static void main(String[] args) {
		int i, j, k;
		
		for(k = 4; k >= 1; k--) {
			for(i = 4; i >= 1; i--) {
				for(j = i; j >= 1; j--)
					System.out.print('*');
				System.out.println();
			}
		}
	}
}