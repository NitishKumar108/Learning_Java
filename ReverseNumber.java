import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter any number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int r;
		int sum=0;
		while(n>0){
			r = n%10;
			sum = (sum*10)+r;
			n /= 10;
	    }
		System.out.println(sum);
	}

}
