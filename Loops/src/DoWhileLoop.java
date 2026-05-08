public class DoWhileLoop {

	public static void main(String[] args) {
		//example1
		
//		int n=5;
//		int a=1;
//		do {
//			System.out.println("Rahul Chauhan");
//			a++;
//		}while(a<=n);
		
		
		//example2
		
		

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String choice;
		do {
			System.out.println("Enter a Number:");
			int n=sc.nextInt();
			System.out.println("Square of "+n+" is "+n*n);
			
			System.out.println("Do you wanna continue? [yes/no]");
			choice = sc.next();
		}
		while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for using My App.");
	}

}
