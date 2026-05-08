public class GreatestNumberAmong3 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number= ");
		int a=sc.nextInt();
		System.out.println("Enter a number= ");
		int b=sc.nextInt();
		System.out.println("Enter a number= ");
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("a is the greatest number");
		else if(b>c)
				System.out.println("b  is greatest number");
		else
			System.out.println("c is greatest number");
	}

}
