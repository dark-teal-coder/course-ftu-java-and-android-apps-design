package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample111 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter max number: ");
		int max = input.nextInt();
		input.close();
		
		int i, sum = 0;
		
		for(i = 1; i <= max; i++) {
			System.out.print(i + ", ");
			sum += i;
		}
		
		System.out.println("\nTotal: " + sum);
	}
}