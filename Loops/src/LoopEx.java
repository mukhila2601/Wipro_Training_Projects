public class LoopEx {

	public static void main(String[] args) {
		//example1
		
		
//		for(int a=1;a<=5;a++) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=1;a<5;a++) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=1;a<=5;++a) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=1;a<=5;a+=1) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=1;a<=5;a=a+1) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=5;a>=1;a--) {
//			System.out.println("Rahul Chauhan");
//		}
//		System.out.println("--------------");
//		for(int a=10;a<=15;a++) {
//			System.out.println("Rahul Chauhan");
//		}
		
		
		//example2
		
//		for(int a=1;a<=5;) {
//			System.out.println("Rahul Chauhan");
//			a++;
//		}
//		System.out.println("--------------");
//		int a=1;
//		for(;a<=5;) {
//			System.out.println("Rahul Chauhan");
//			a++;
//		}
//		System.out.println("--------------");
//		for(;;) {  //Infinite Loop
//			System.out.println("Rahul Chauhan");
//		}
//		//System.out.println("bye");//error
		
		
		
		//example3
		
//		for(int a=1;a++<=5;) {
//			System.out.println("Rahul");
//		}
//		System.out.println("--------------");
//		for(int a=1;++a<=5;) {
//			System.out.println("Rahul");
//		}
//		System.out.println("--------------");
//		for(int a=1;a++<=5;a++) {
//			System.out.println("Rahul");
//		}
		
		
		//example4
		
		
//		for(int a=1;a<=5;a++, System.out.println("Hello")) {
//			System.out.println("Rahul");
//		}
		
		
		
		//example5
		
		
//		for(int a=1;a<=5;a++) {
//			System.out.print(a+" ");
//		}
//		System.out.println("\n--------------");
//		int x=5;
//		for(int a=1;a<=x;a++) {
//			System.out.print(x+" ");
//		}
//		System.out.println("\n--------------");
//		for(int a=1;a<=10;a+=2) {
//			System.out.print(a+" ");
//		}
		
		
		
		//example6
		

//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int n=sc.nextInt();
//		for(int a=1;a<=n;a++) {
//			System.out.println("Hello");
//		}
		
		
		
		//example7
		

//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int a=1;a<=n;a++) {
//			sum+=a; //sum= sum+a;
//		}
//		System.out.println("Addition: "+sum);
		
		
		//example8
		

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int mul=1;
		for(int a=1;a<=n;a++) {
			mul*=a;
		}
		System.out.println("Product: "+mul);
	}

}
