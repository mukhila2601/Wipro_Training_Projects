public class FactorialOfNumber {
	public static void main(String[] args) {
		int i,fact=1;
		java.util.Scanner sc=new java.util.Scanner (System.in);
		
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact); 
	}

}
