package javaoops.polymorphism;

class A1{
	void addition(int x, int y) {
		int res=x+y;
		System.out.println(res);
	}
}

class B1 extends A1{
	void addition(int x, int y) {
		int res=x+y;
		System.out.println(res);
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj=new B1();
		obj.addition(3, 4);
	}

}
