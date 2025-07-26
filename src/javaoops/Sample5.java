package javaoops;
//to access a non static variable within a static field
public class Sample5 {
	int num=30;
	public static void main(String[] args) {
		Sample5 obj=new Sample5();
		System.out.println(obj.num ); //if we dont want to create the object then make num as static
	}
}
