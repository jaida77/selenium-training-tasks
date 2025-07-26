package javaoops.encapsulation;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.setEmp_id(1);
		obj.setEmp_name("jaida");
		obj.setEmp_email("jaidafathima@gmail.com");
		System.out.println(obj.getEmp_id()+ " " + obj.getEmp_name()+ " " + obj.getEmp_email() );
		System.out.println(obj);
	}

}
