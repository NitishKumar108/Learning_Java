import java.util.Scanner;

public class SumOfEvenAndOddDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number: ");
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int sum = 0;
		
		int evensum=0;
		int oddsum=0;
		
	    while(n>0) {
	    	int rem = n%10;
	    	
	         if(rem%2 ==0) {
	        	 evensum += rem;
	         }
	         else {
	        	 oddsum += rem;
	         }
	         n /= 10;
	    }
	    System.out.println("Sum of Even digit: " + evensum);
	    System.out.println("Sum of Odd digit: " + oddsum);

	}

}
