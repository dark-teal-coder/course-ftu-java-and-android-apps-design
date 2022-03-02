package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample110a {
	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int userAge = check.nextInt();
		check.close();
		
		// String answer = (userAge < 18) ? "cannot" : "can";
		
		System.out.println("You " + ((userAge < 18) ? "cannot" : "can") + " see this film!");
		System.out.println("Thank You.");
	}
}