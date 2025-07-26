import java.util.Scanner;

public class Sample5 {
	static int addition(int x, int y) {
		int res;
		res= x+y;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number1: ");
		int number1;
		number1 = sc.nextInt();
		System.out.println("enter number2: ");
		int number2;
		number2 = sc.nextInt();
		int result;
		result = addition(number1, number2);
		System.out.println("sum of two numbers are: " + result);
		}

}
