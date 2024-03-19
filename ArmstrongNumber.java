import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*An Armstrong number is a n digit number, 
		which is equal to the sum of the nth powers of its digits.
		Example 153, 371, 1634, 54748.
		For example 153 is an Armstrong number because 
		cube of 1 is 1(1x1x1=1) + cube of 5 is 125(5*5*5=125) + cube of 3 is 27(3*3*3=27). 
		Now add all the cubes 1+125+27=153 which is equals to number itself*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n = sc.nextInt();
		int temp = n;
		
		//int count = (n+"").length();
		int count = 0; //count the number of digit.
		while(n>0) {
			count++;
			n /= 10;
		}
		
		n = temp;
		int sum = 0;
		
		while(n>0) { //performing the calculation.
			//sum += (int) Math.pow(d, count);
			int d = n % 10;
			int prod = 1;
			for(int i=1; i<=count; i++) {
				prod *= d; //prod = prod * d
		    }
			sum += prod;
			n /= 10;
		}
		if(sum==temp) 
			System.out.println(temp + " is an armstrong number");
			
			else 
				System.out.println(temp + " is not an armstrong number");
	}

}
