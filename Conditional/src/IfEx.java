public class IfEx {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if(a>=13 && a<=19) {
			System.out.println("You are Teenager!");
			System.out.println("Your age: "+a);
		}
		System.out.println("Thanks for using APP");
	}

}
