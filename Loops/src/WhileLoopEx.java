
public class WhileLoopEx {

	public static void main(String[] args) {
		//example1
		
//		int n=5;
//		int a=1;
//		while(a<=n) {
//			System.out.println("Rahul Chauhan");
//			a++;
//		}

		//example2
		

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		while(n!=0) {
			int r=n%10;
			System.out.print(r);
			n/=10;
		}
		
		sc.close();
	}

}
