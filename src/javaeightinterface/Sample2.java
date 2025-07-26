package javaeightinterface;

interface I2{
	void method2();
	
	default void log(String msg){
		System.out.println("I2 log: " + msg);
	}
}
public class Sample2 implements I1,I2 {
	public void method1() {
		System.out.println("inside method1");
	}
	public void method2() {
		System.out.println("inside methode2");
	}
//	If a class implements multiple interfaces that have the same default method, the class must override it.Otherwise, the compiler doesn't know which one to use → conflict!
	@Override
	public void log(String str) { 
		System.out.println("Sample2 log: " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj=new Sample2();
		obj.log("start");
		obj.method1();
		obj.method2();
	}

}
