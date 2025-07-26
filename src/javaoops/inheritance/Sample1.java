package javaoops.inheritance;

class A1{
	int number1 = 10;
}

class B1 extends A1{
	int number2 = 30;
	int result;
	void addition() {
		result= number1 + number2;
		System.out.println("result is: " + result);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.addition();
	}

}
