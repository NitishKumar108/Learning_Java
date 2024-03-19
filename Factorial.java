import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scn = new Scanner(System.in);
		
		System.out.println("Number: ");
		int n = scn.nextInt();
		int fac = 1;
		
		for(int i=1; i<=n; i++) {
			fac *= i; 
		}
		System.out.println(fac);
	}

}
