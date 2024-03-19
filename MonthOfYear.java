import java.util.Scanner;

public class MonthOfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter month: ");
		int m = scn.nextInt();
		System.out.println("Enter year: ");
		int y = scn.nextInt();
		switch(m) {
		case 1 : System.out.println("January"); System.out.println("31 Days"); break;
		case 3 : System.out.println("March"); System.out.println("31 Days"); break;
		case 5 : System.out.println("May"); System.out.println("31 Days"); break;
		case 7 : System.out.println("July"); System.out.println("31 Days"); break;
		case 8 : System.out.println("August"); System.out.println("31 Days"); break;
		case 10 : System.out.println("October"); System.out.println("31 Days"); break;
		case 12 : System.out.println("December"); System.out.println("31 Days"); break;
		
		case 4 : System.out.println("April"); System.out.println("30 Days"); break;
		case 6 : System.out.println("June"); System.out.println("30 Days"); break;
		case 9 : System.out.println("September"); System.out.println("30 Days"); break;
		case 11: System.out.println("November"); System.out.println("30 Days"); break;
		
		case 2 : System.out.println("February"); 
		if(y%400 == 0 || (y%4 == 0 && y%100 != 0)) {
			System.out.println("29 Days");
		}
		else {
			System.out.println("28 Days");
			break;
		}
		
		default : System.out.println("Invalid Input."); break;
		}
		System.out.println("End of the program.");
	}

}
