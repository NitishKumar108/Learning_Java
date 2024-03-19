import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// Natural numbers includes all the positive integers from 1 till infinity 
		// and are also used for counting purpose
		System.out.println("Enter number: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int sum = 0;
		for(int i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of 1 to " + n + " = " + sum);

	}

}
