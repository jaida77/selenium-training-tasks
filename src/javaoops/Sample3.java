package javaoops;
	class Employee{
		int e_id;
		String e_name;
		Employee(){
			System.out.println("default constructor");
		}
		Employee(int e_id, String e_name){
			this.e_id=e_id; //refers to instance variable if there was to this it would refer to the parameter only
			this.e_name=e_name;
		}
		void getInfo(){
			System.out.println(this.e_id + " " + this.e_name); //here this is not neccessary in this situation but just for clarity
		}
	}
public class Sample3 {
	public static void main(String[] args) {
		Employee Eobj1 = new Employee(101, "jaida");
		Eobj1.getInfo();
		Employee Eobj2 = new Employee(102, "fathima");
		Eobj2.getInfo();
	}
}
