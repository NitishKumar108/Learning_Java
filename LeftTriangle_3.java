import java.util.Scanner;

public class LeftTriangle_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) 
		{
			for(int j=0; j<=i; j++) 
			{
					System.out.print("* ");
			}
				System.out.println(" ");
		}
	}

}
