package task.oops;

abstract class Appliance{
	abstract void turnOn();
}

interface Connect{
	void connect();
}

class SmartTV extends Appliance implements Connect{
	public void turnOn() {
		System.out.println("TV is turned on");
	}
	public void connect() {
		System.out.println("TV is connected");
	}
}
public class ExerciseOOPS8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV obj=new SmartTV();
		obj.turnOn();
		obj.connect();
	}

}
