import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		/*Factors of a number are defined as numbers that divide the original number evenly or exactly. 
		The meaning of a factor is a whole number that can divide a greater number evenly. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int m = n/2;
		System.out.print("Factor of " +n+ " = ");
		for(int i=1; i<=m; i++) {
			if(n%i == 0) {
				
				System.out.print(i + ", ");
			}	
		}
	}
}
