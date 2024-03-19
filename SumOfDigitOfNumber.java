import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number: ");
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int sum=0;
		
		/*for(sum=0; n!=0; n=n/10) {
			sum = sum + n%10;
		}
		System.out.println("Sum of Digit: "+ sum);*/
		
		int digit;
		while(n>0) {
			digit = n%10;
			sum = sum + digit;
			n = n/10;
		} 
		System.out.println(sum);
		
		

	}

}
