import java.util.Scanner;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any binary number: ");
		Scanner scn = new Scanner(System.in);
		int bin = scn.nextInt();
		
		int temp = bin;
		int dec = 0;
		int i = 1;
		while(bin>0)
		{
		    dec += (bin%10)*i;
		    i *= 2;
		    bin /= 10;
		}
		System.out.println("Decimal value of "+temp+" is: "+dec);
	}

}
