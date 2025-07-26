
abstract class Shapeee{
	abstract void area();
	void  displayShapeType() {
		System.out.println("inside displayShapeType method");
	}
}
class Circleee extends Shapeee{
	double radius;
	Circleee(double radius){
		this.radius=radius;
	}
	public void area() {
		double area= 2*3.14*radius*radius;
		System.out.println("area of circle is: " + area);
	}
}
class Rectangleee extends Shapeee{
	double length,width;
	Rectangleee(double length, double width){
		this.length=length;
		this.width=width;
	}
	public void area() {
		double area= length*width;
		System.out.println("area of rectangle is: " +area);
	}
}

public class ExerciseEXCEPTIONHANDLING1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapeee obj1=new Circleee(3);
		obj1.area();
		Shapeee obj2 = new Rectangleee(3,6);
		obj2.area();
		obj1.displayShapeType();
		
	}
}