import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any number: ");

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();	 
		int multi = 1;
		int i=1;
		for(i=1; i<=10; i++)
		{	
			System.out.print(n+" "+"\t");
		}
		System.out.println();
		System.out.println();
		for(i=1; i<=10; i++)
		{	
			System.out.print(i+" "+"\t");
		}
		System.out.println();
		System.out.println();
		for(i=1; i<=10; i++)
		{	
			System.out.print(n*i+" "+"\t");
		}

	}

}
