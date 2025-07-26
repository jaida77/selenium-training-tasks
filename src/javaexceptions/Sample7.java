package javaexceptions;

public class Sample7 {
public static void main(String[] args) {
	int num=50;
	int div=0;
	try {
		int res=num/div;
		System.out.println(res);
	}catch(ArithmeticException ex) {
		System.out.println("Exception occured");
	}finally {
		System.out.println("finally block executed");
	}
}
}
