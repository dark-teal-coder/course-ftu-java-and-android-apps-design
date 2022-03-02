package javaandroidappsdesign.lesson03;

public class Sample121 {
	private static int marks = 80;
	private static char grade = 'B';
	
	private static void testingA() {
		marks = 90;
		grade = 'A';
	}
	
	private static void testingB() {
		System.out.println(marks + " & " + grade);
		int marks = 60;
		char grade = 'E';
		System.out.println(marks + " & " + grade);
	}
	
	private static void testingC(int marks, char grade) {
		System.out.println(marks + " & " + grade);
		marks = 90; grade = 'A';
		System.out.println(marks + " & " + grade);
	}
	
	public static void main(String[] args) {
		System.out.println("testingA: " + marks + " & " + grade);
		testingA();
		System.out.println("testingA: " + marks + " & " + grade);
		System.out.println();
		
		System.out.println("testingB: " + marks + " & " + grade);
		testingB();
		System.out.println("testingB: " + marks + " & " + grade);
		System.out.println();
		
		System.out.println("testingC: " + marks + " & " + grade);
		testingC(44, 'F');
		System.out.println("testingC: " + marks + " & " + grade);
	}
}