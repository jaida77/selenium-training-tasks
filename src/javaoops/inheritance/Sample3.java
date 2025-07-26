package javaoops.inheritance;
//heirarchical
class A3{
	String shape;
}

class B3 extends A3{
	void square() {
		shape= "square";
		System.out.println("shape is: "+ shape);
	}
	
	
}

class C3 extends A3{
	void circle() {
		shape= "circle";
		System.out.println("shape is: "+ shape);
	}
	
	
}

class D3 extends A3{
	void rect() {
		shape= "rect";
		System.out.println("shape is: "+ shape);
	}
	
	
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 obj1=new B3();
		C3 obj2=new C3();
		D3 obj3=new D3();
		
		obj1.square();
		obj2.circle();
		obj3.rect();
	}

}
