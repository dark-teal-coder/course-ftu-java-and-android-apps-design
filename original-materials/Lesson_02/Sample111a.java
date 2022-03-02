package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample111a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter max number: ");
		int max = input.nextInt();
		input.close();
		
		int i, sum = 0;
		
		for(i = 1; i <= max; i++) {
			// Method 1: 
			if(i != max)
				System.out.print(i + ", ");
			else
				System.out.print(i);
			
			// Method 2: 
			// System.out.print(i + (i != max ? ", " : ""));
			
			sum += i;
		}
		
		System.out.println("\nTotal: " + sum);
	}
}