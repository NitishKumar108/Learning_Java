import java.util.Scanner;

public class PrimeOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int n = scn.nextInt();
		boolean flag = true;
		for(int i=2; i<=n; i++)
		{
			if(i<=1) continue;
			flag = true;
			
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag=true)
				System.out.println(i);
		}
		
		
		}

}
