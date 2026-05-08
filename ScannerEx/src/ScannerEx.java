public class ScannerEx {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner (System.in);
		System.out.println("Enetr a Integer Number:");
		int a=sc.nextInt();
		System.out.println("Enetr a FloatingPoint Number:");
		double b=sc.nextDouble();
		System.out.println("Enetr a String:");
		String c=sc.next();
		System.out.println("Entered values are: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}

}
