import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any year: ");
		Scanner scn = new Scanner(System.in);
		
		int y = scn.nextInt();
		
		if(y%400 == 0 || (y%4 == 0 && y%100 != 0)) {
			System.out.println(y + " is a leap year.");
		}
		else {
			System.out.println(y + " is not a leap year.");
		}
	}

}
