package javaoops.inheritance;

class A4{
	double pi= 3.14;
}

class B4 extends A4{
	void area_of_circle() {
		double res= 2*pi* 5;
		System.out.println("area of circle: "+ res);
	}
}

class C4 extends A4{
	void surface_area_of_sphere() {
		double res= 4 *pi* 5;
		System.out.println("area of circle: "+ res);
	}
}

class D4 extends B4{
//	void area_of_circle() {
//		double res= 2*pi* 5;
//		System.out.println("area of circle: "+ res);
//	}
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D4 obj=new D4();
		obj.area_of_circle();
	}

}
