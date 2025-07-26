import java.util.Scanner;

public class Sample7 {
	static int multiplication(int x, int y) {
		int res= x*y;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number1: ");
		int number1= sc.nextInt();
		System.out.println("enter the number2: ");
		int number2=sc.nextInt();
		int result= multiplication(number1,number2);
		System.out.println("product of two numbers are: " + result);
		
	}
}
