package Day2;

public class Day2Q1 {
public static void main(String[] args) {
		
		int amount = 6000;
		double discount = 0;
		
		if (amount>=15000) {
			discount = 0.20 * amount;
		}
		else if (amount>=10000) {
			discount = 0.10 * amount;
		}
		else if (amount>=4000) {
			discount = 0.5 * amount;
		}
		else if (amount>=2000) {
			discount = 0.2 * amount;
		}
		
		double finalAmount = amount - discount;
		
		System.out.println("Final Amount : " + finalAmount);
		
	}
}
