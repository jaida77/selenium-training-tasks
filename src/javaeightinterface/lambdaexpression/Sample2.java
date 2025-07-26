package javaeightinterface.lambdaexpression;

interface ZeroParameter{
	void display();
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroParameter obj=() -> System.out.println("this is a zero parameter expression");
		obj.display();
	}

}
