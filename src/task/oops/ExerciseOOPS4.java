package task.oops;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area() {
		return 3.14*radius*radius;
	}
}

class Rectangle extends Shape{
	int length, width;
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	double area(){
		return length*width;
	}
}
public class ExerciseOOPS4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1=new Circle(5);
		Rectangle obj2=new Rectangle(3,5);
		System.out.println("area of circle: " +	obj1.area());
		System.out.println("area of rectangle: "+ obj2.area());
	

		}

}