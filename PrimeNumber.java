import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Prime numbers are natural numbers that are divisible by 
		//only 1 and the number itself like  2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and so on.
		System.out.println("Enten any number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 0;
		int m = num/2;
		
		for(int i=2; i<=m; i++) {
			if(num%i == 0) {
				System.out.println(num+" Is not a prime");
				count = 1;
				break;
			}	
		}
		if(count == 0) {
			System.out.println(num+" Is a prime.");
		}
	}

}
