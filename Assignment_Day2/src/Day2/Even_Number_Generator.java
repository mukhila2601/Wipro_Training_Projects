package Day2;

public class Even_Number_Generator {
public static void main(String[] args) {
		
		int n = 20;
		
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
	}

}
