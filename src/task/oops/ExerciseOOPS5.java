package task.oops;

class Vehicle{
	String brand;
	int speed;

	void showDetails() {
		System.out.println("showing vehicle details");

	}
}

class Car extends Vehicle{
	void showDetails() {
		System.out.println("this is car class");
	}
}

class Bike extends Vehicle{
	void showDetails() {
		System.out.println("this is bike class");
	}
}
public class ExerciseOOPS5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car obj1=new Car();
		Bike obj2=new Bike();
		obj1.showDetails();
		obj2.showDetails();
	
	}

}