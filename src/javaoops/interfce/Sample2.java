package javaoops.interfce;

interface I2{
	void addition();
}

interface I3{
	void subtraction();
}
public class Sample2 implements I2,I3 {
	public void addition() {
		System.out.println("inside addition function");
	}
	public void subtraction() {
		System.out.println("inside subtraction function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj=new Sample2();
		obj.addition();
		obj.subtraction();
	}

}
