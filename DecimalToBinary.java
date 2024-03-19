import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number: ");
		
		Scanner scn = new Scanner(System.in);
		int dec = scn.nextInt();
		
		System.out.println("Binary value of "+dec+" is: " + Integer.toString(dec, 2));
//		System.out.println("Binary value of "+dec+" is: " + Integer.toBinaryString(dec));
	}

}
