import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two number");
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int hcf = 1;
		for(int i=1; i<=a || i<=b; i++) {
			if(a%i == 0 && b%i == 0) hcf = i;
		}
		System.out.println("HCF is: " + hcf);

	}

}
