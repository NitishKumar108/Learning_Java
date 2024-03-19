import java.util.Scanner;

public class PrimeBetweenRange {
	static boolean isPrime(int n) {
//		int count = 0;
		
		if(n<2) //0, 1, and -ve numbers are not prime.
			return false;
		
		//checking the number of divisors b/w 1 and the number n-1.
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		//if reached here then must be true.
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter starting range: ");
		int a = scn.nextInt();
		System.out.print("Enter end range: ");
		int b = scn.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(isPrime(i)) System.out.println(i);
		}
	}

}
