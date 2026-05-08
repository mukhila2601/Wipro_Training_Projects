public class SimpleInterest {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a principle :");
		int a=sc.nextInt();
		System.out.println("Enter a rate :");
		int b=sc.nextInt();
		System.out.println("Enter a time :");
		int c=sc.nextInt();
		double d=(a*b*c)/100;
		System.out.println(d);
	}

}
