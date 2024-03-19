import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Star pattern");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int space = n/2;
		int star = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				if(k==1 || k==star)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
			
			if(i<n/2)
			{
				space--;
				star += 2;
			}
			else
			{
				space ++;
				star -= 2;
			}
		}

	}

}
