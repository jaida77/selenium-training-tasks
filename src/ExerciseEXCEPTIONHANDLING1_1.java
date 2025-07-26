
abstract class Shapee{
	abstract void area();
}
class Circlee extends Shapee{
	double radius;
	Circlee(double radius){
		this.radius=radius;
	}
	public void area() {
		double area= 2*3.14*radius*radius;
		System.out.println("area of circle is: " + area);
	}
}
class Rectanglee extends Shapee{
	double length,width;
	Rectanglee(double length, double width){
		this.length=length;
		this.width=width;
	}
	public void area() {
		double area= length*width;
		System.out.println("area of rectangle is: " +area);
	}
}

public class ExerciseEXCEPTIONHANDLING1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlee obj1=new Circlee(3);
		obj1.area();
		Rectanglee obj2 = new Rectanglee(3,6);
		obj2.area();
		
	}

}
