package javaeightinterface;

interface MyData{
//	cant override this method since it's static.
	static boolean isNull(String msg) {
		System.out.println("interface null check..");
		return msg==null?true:"".equals(msg)?true:false;
	}
	default void display(String msg) {
		if(isNull(msg)) {
			System.out.println("message is null");
		}else {
			
			System.out.println("message is :" + msg);
		}
	}
}
public class Sample3 implements MyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj=new Sample3();
		obj.display("welcome");
		
	}

}
