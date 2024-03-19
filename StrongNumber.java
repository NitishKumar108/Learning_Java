import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		/*Strong Numbers are the numbers whose sum of factorial of 
		digits is equal to the original number like...1, 2, 145, 40585.*/
		
		int temp = n;
		int sum = 0;
		
		while(n>0) {
			int d = n%10;
			int f = 1;
			for(int i=1; i<=d; i++) {
				f *= i;
			}
			sum += f;
			n /= 10;
		}
		if(sum==temp) 
			System.out.println(sum + " is strong number");
			else 
				System.out.println(sum + " is not strong number");
			

	}

}
