import java.util.Scanner;

public class CheckNumInFiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check whether number is belonging to fibonacci series or not.
		//0,1,1,2,3,5,8,13,21
		System.out.print("Enter any fibo number: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a=0, b=1, c=0;
		while(c<n){
			c = a + b;
			a = b;
			b = c;
		}
		if (n == c) 
			System.out.println("Number belongs to Fibonacci series.");
		else 
			System.out.println("Number does not belong to Fibonacci series.");
		
	}

}
