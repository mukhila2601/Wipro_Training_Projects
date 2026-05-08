public class PrimeOrNot {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++) 
		{
			if(n%i==0) 
			{
				count++;
				break;
				
			}
		}
			if(count==0)
			
				System.out.println("It is prime number");
			
			else
			{
				System.out.println("It is  not prime");
				}
		}
	}

