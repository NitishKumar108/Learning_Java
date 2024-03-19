import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any value: ");
		int  n=scn.nextInt();
		
		for(int i=0; i<=n; i++) { //printing the row value 
			for(int j=0; j<=i; j++) { //printing the column value
				System.out.print(" *");
			}
			for(int j=n; j>i; j--)
			{
				System.out.print("  ");
			}
			for(int l=n; l>=i; l--) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
