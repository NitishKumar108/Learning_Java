import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int k=i;
			for(int j=1; j<=n; j++)
			{
				System.out.print(k +"\t");
				k +=n ;
			}
			System.out.println();
		}

	}

}
