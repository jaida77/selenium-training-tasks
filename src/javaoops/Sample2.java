package javaoops;
	class Student{
		int s_id;
		String s_name;
		
		Student(){
			s_id=101;
			s_name="jaida";
			System.out.println("defualt constructor is being executed");
		}
		
		void getInfo() {
			System.out.println(s_id  + " " + s_name);
		}
		
	}
public class Sample2 {
	public static void main(String[] args) {
		Student Sobj= new Student();
		Sobj.getInfo();
	}
}
