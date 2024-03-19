import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter any number");
        //Numbers that read the same backwards and forwards.
        //The number "17371" is a Palindromic Number.
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem = 0;
		int temp=n;
		while(n>0){
			int r = n%10;
			rem = (rem*10)+r;
			n /= 10;
		}
		
		if(temp==rem){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a palindrome number");
		}
	}

}
