
public class ReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method start");
		int x=m1(5);
		System.out.println("X = "+x);
		int y=m1(4);
		System.out.println("Y = "+y);
		int z=m1(3);
		System.out.println("Z = "+z);
		System.out.println("main method end");
//		System.out.println();
	}
	
	public static int m1(int a) {
		System.out.println(a);
		return 10*a ;

	}

}
