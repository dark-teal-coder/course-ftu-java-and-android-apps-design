package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample110 {
	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int userAge = check.nextInt();
		check.close();
		
		String answer = (userAge < 18) ? "cannot" : "can";
		
		System.out.println("You " + answer + " see this film!");
		System.out.println("Thank You.");
	}
}