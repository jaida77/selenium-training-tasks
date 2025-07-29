package task.oops;

class Calculator{
	void add(int a, int b) {
		int res=a+b;
		System.out.println("addition of integers: " +res);
	}
	void add(double a, double b) {
		double res=a+b;
		System.out.println("addition of doubles: " + res);
	}
	void add(String a,String b) {
		String res= a+b;
		System.out.println("addition of strings: " + res);
	}
}
public class ExerciseOOPS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator();
		obj.add(3.5, 4.5);
		obj.add(3, 5);
		obj.add("hello", "world");
	}

}
