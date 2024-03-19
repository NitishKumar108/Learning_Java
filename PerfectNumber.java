import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
        System.out.println("Enter any number: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
//		The sum of the factor of a number is equal to that number.
//		That number is called as perfect number like 6, 28, 496, and 8128. 
		int m = n/2;
		int sum = 0;
		
		for(int i=1; i<=m; i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(sum==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}

}
