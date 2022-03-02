package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample106 {
	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String userName = check.nextLine();
		
		System.out.print("How old are you? ");
		int userAge = check.nextInt();
		
		check.close();
		
		if(userAge >= 18) {
			System.out.println(userName + ", you can see this film.");
		}
		System.out.println("Thank You.");	
	}
}