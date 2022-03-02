package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample112 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter max number: ");
		int max = input.nextInt();
		input.close();
		
		int product = 1;
		int num = 1;
		
		while(num <= max) {
			product *= num;
			System.out.println(num + "! = " + product); // Factorial
			num++; 
		}
	}
}