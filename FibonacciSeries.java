import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter any number: ");
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 1, c;
        
        for(int i=1; i<=n; i++) {
        	System.out.println(a);
        	c = a+b;
        	a = b;
        	b = c;
        }
	}

}
