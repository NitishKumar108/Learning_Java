import java.util.Scanner;

public class BiggerNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any number");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if(a>b) {
			System.out.println(a + " is bigger.");
		}
		else if(b>a){
			System.out.println(b + " is bigger.");
		}
		else if(a==b) {
			System.out.println(a + " and " + b + " Both are equal.");
		}
		else {
			System.out.println("Invalid Input.");
		}
	}

}
