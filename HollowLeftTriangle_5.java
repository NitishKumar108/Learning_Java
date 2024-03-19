import java.util.Scanner;

public class HollowLeftTriangle_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number of Rows: ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				if(j==1 || j==i || i==n){
				       System.out.print("*");
				     }
				     else{
				       System.out.print(" ");
			}
				
		
			}System.out.println();
	     }
	}

}
