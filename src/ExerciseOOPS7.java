class Animal {
	void sound() {
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}
class Cow extends Animal{
	void sound() {
		System.out.println("cow moos");
	}
}
public class ExerciseOOPS7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic method dispatch.
		Animal obj;
		
		obj=new Dog();
		obj.sound();
		
		obj=new Cat();
		obj.sound();
		
		obj=new Cow();
		obj.sound();
		
	}

}
