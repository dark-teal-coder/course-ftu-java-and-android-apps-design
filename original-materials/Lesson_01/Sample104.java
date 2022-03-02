package javaandroidappsdesign.lesson01;

import java.util.Scanner;

public class Sample104 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1st Number: ");
		int inputNum1 = input.nextInt();
		
		System.out.print("2nd Number: ");
		int inputNum2 = input.nextInt();
		
		System.out.println("Sum: " + (inputNum1 + inputNum2));
		System.out.println("Difference: " + (inputNum1 - inputNum2));
		
		input.close();
	}
}