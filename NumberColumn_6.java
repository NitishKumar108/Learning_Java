import java.util.Scanner;

public class NumberColumn_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Star pattern");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(" "+ i +" ");
//				System.out.print(" "+ j +" ");
			}System.out.println();
		}
	}

}
