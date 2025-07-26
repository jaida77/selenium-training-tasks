class Employee{
	static int count;
	String name;
	public Employee(String name) {
		this.name=name;
		count++;
	}
	void show() {
		System.out.println("employee name is:" + this.name);
	}
	static void showCount() {
		System.out.println("count: "+ count);
	}
}
public class ExerciseOOPS2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("jaida");
		Employee obj2=new Employee("alaina");
		obj.show();
		obj2.show();
		Employee.showCount(); //don't need object.
		
	}

}
