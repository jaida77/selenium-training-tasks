package javaoops;

class Employee1{
		int emp_id;
		String emp_name;
		static String emp_company="wipro";
	
	Employee1(int emp_id, String emp_name){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
	}
	void getEmpInfo() {
		System.out.println(this.emp_id +" "+ this.emp_name+" "+ emp_company);
	}
}

public class Sample4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 Eobj1=new Employee1(101,"jaida");
		Employee1 Eobj2=new Employee1(102,"alaina");
		Employee1 Eobj3=new Employee1(103,"vishnu");
		Employee1 Eobj4=new Employee1(104,"sanjai");
		
		Eobj1.getEmpInfo();
		Eobj2.getEmpInfo();
		Eobj3.getEmpInfo();
		Eobj4.getEmpInfo();
	}

}
