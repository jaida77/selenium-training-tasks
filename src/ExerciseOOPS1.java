 class Book{
	String title,author;
	double price;
	
	void displayDetails() {
		System.out.println("title: "+ title);
		System.out.println("author: "+ author);
		System.out.println("price: "+ price);
	}
	
}
public class ExerciseOOPS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1=new Book();
		obj1.title="hello";
		obj1.author="jaida";
		obj1.price=500.0;
		obj1.displayDetails();
		System.out.println("--------");
		Book obj2=new Book();
		obj2.title="hii";
		obj2.author="alaina";
		obj2.price=200.0;
		obj2.displayDetails();
		
	}

}
