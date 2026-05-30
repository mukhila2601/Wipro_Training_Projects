package Day2;

public class Shopping_Cart_Total_Calculator {
public static void main(String[] args) {
		
		double[] prices = {100, 250, 55, 0};

        double total = 0;

        for (double price : prices) {
            if (price == 0) {
                break;
            }
            total += price;
        }

        System.out.println("Total Amount: " + total);
	}
}
