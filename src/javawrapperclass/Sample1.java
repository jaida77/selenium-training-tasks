package javawrapperclass;

public class Sample1 {
	public static void main(String[] args) {
		//primitive data type
		
		int number;
		number=200;
		
		//Integer wrapper type
		Integer number1;
		
		//auto boxing : converting primitive int to Integer Object
		number1=number;
		
		System.out.println("the primitive int number is: " + number);
		System.out.println("the integer object number1 is "+ number1 );
	}
	
	
	
}
