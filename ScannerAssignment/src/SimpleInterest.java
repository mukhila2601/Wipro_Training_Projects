public class SimpleInterest {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Principal= ");
		int p=sc.nextInt();
		System.out.println("Enetr Rate of Interest= ");
		int r=sc.nextInt();
		System.out.println("Enetr Time= ");
		int t=sc.nextInt();
		//double s=p*(1+(r*t));
		int s=p*r*t;
		System.out.println(s);
	}

}
