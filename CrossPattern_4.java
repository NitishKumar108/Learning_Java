import java.util.Scanner;

public class CrossPattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Star pattern");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i, j;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(i==j || i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
//				System.out.print(i+""+j+"  ");
			}System.out.println();
		}
	}

}
