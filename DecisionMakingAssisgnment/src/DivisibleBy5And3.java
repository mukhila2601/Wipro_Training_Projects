public class DivisibleBy5And3 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number= ");
		int a=sc.nextInt();
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.print("divisible by 5 and 3 ");
			}
		if(a%3==0) {
			System.out.println("divisible byr 3");
		}
		if(a%5==0) {
			System.out.println("divisible by 5");
		}
		else {
			System.out.println("not divisible by 5 and 3");
		}
	}

}
