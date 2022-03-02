package javaandroidappsdesign.lesson03;

public class Sample122a {
	public static void main(String[] args) {
		int totalCost = 0;
		double totalSales = 0.0;
		
		int[] cost = {3000, 5000, 8000};
		double[] sales = {1245.6, 5178.9, 1797.3, 5156.7};
		
		for(int c : cost) {
			totalCost += c;
			System.out.print("[" + c + "]");
		}
		
		System.out.println("\nTotal Cost: " + totalCost);
		
		for(double eachSales : sales) {
			totalSales += eachSales;
			System.out.print("{" + eachSales + "}");
		}
		
		System.out.println("\nTotal Sales: " + totalSales);
	}
}