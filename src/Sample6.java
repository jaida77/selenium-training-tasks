import java.util.Scanner;

public class Sample6 {
	static int subtraction(int x, int y) {
		int res= x-y;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number1: ");
		int number1= sc.nextInt();
		System.out.println("enter the number2" );
		int number2 = sc.nextInt();
		int result= subtraction(number1,number2);
		System.out.println("difference of two numbers are: "+ result);
	}

}
