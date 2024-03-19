import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Star pattern");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=(2*i)-1; k++)
			{
//				System.out.print(" *");
//				System.out.print(k+" ");
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}
