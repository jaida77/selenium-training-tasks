package javaoops.polymorphism;

class Calculation1{
	void addition(int x,int y) {
		int res=x+y;
		System.out.println(res);
	}
	void addition(double x, double y) {
		double res=x+y;
		System.out.println(res);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation1 obj=new Calculation1();
		obj.addition(3.5, 40.5);
		obj.addition(4, 5);
	}

}
