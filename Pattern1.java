import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any value. ");
		int n = scn.nextInt();
		
		for(int i=n; i<=1;i++)
		{
			for(int j=i; j>1; j--)
			{
				System.out.print(j);
				if(j!=1)
					System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
