package javaeightinterface;

interface I1{
	void method1();
	default void log(String msg) {
		System.out.println("I1 log: " + msg);
	}
}
public class Sample1 implements I1{
	public void method1() {
		System.out.println("inside method1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new Sample1();
		obj.log("start");
		obj.method1();
	}

}
