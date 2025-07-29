package task.multithreading;

class ExerciseMULTITHREADING11 extends Thread { 
	public ExerciseMULTITHREADING11(String name) { 
		super(name); 
	} 
	
	public void run() { 
		for(int i = 1; i <= 5; i++) { 
			System.out.println(getName() + " is running " + i); 
			try { 
				Thread.sleep((int)(Math.random() * 1000)); 
			} catch(Exception e) {} 
		} 
	} 

	public static void main(String[] args) { 
		new ExerciseMULTITHREADING11("Tortoise").start(); 
		new ExerciseMULTITHREADING11("Rabbit").start(); 
		new ExerciseMULTITHREADING11("Dog").start(); 
	} 
}
