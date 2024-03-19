import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter day of a week: ");
		Scanner scn = new Scanner(System.in);
		
		int d = scn.nextInt();
		switch(d) {
		case 1 : System.out.println("Monday"); break;
		case 2 : System.out.println("Tuesday"); break;
		case 3 : System.out.println("Wednesday"); break;
		case 4 : System.out.println("Thrusday"); break;
		case 5 : System.out.println("Friday"); break;
		case 6 : System.out.println("Saturday"); break;
		case 7 : System.out.println("Sunday"); break;
		
		default: System.out.println("Invalid Input."); break;
		}
	
		System.out.println("End of the program.");
		
	}
	

}
