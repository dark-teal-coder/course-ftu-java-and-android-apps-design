package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample109 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		int num = input.nextInt();
		input.close();
		
		switch(num /= 10) {
			case 10:
			case 9:
				System.out.println("Grade A");
				break;
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
				System.out.println("Grade C");
				break;
			case 6:
				System.out.println("Grade D");
				break;
			case 5:
				System.out.println("Grade E");
				break;
			default:
				System.out.println("Fail");
		}
	}
}