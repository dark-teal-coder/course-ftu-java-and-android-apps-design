package javaandroidappsdesign.lesson03;

public class Sample122 {
	public static void main(String[] args) {
		int i, totalCost = 0;
		double totalSales = 0.0;
		
		int[] cost = {3000, 5000, 8000};
		double[] sales = {1245.6, 5178.9, 1797.3, 5156.7};
		
		for(i = 0; i < cost.length; i++) {
			totalCost += cost[i];
			System.out.print("[" + cost[i] + "]");
		}
		
		System.out.println("\nTotal Cost: " + totalCost);
		
		for(double eachSales : sales) {
			totalSales += eachSales;
			System.out.print("{" + eachSales + "}");
		}
		
		System.out.println("\nTotal Sales: " + totalSales);
	}
}