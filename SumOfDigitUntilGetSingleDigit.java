import java.util.Scanner;

public class SumOfDigitUntilGetSingleDigit {

	public static void main(String[] args) {
		// Sum of digit until we get single unit digit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		do {
			sum=0;
			while(n>0) {
				sum += n%10;
				n/=10;
			}
			System.out.println("Sum of digit: " + sum);
			n = sum;
		}
		while(n>9);
	}

}
