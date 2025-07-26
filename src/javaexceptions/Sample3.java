package javaexceptions;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
		int div=0;
		try {
			int res=num/div;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println("exception occured, divide by zero not allowed");
		}
		
		
	}

}
