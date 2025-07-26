package javaoops.polymorphism;

class Calculation{
	void addition(int x, int y) {
		int res= x+y;
		System.out.println(res);
	}
	void addition(int x, int y, int z) {
		int res=x+y+z;
		System.out.println(res);
	}
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj=new Calculation();
		obj.addition(34, 20);
		obj.addition(45, 30, 40);
	}

}
