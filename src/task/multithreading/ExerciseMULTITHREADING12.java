package task.multithreading;

public class ExerciseMULTITHREADING12 extends Thread { 
	public void run() { 
		for(int i = 10; i >= 1; i--) { 
			System.out.println("Countdown: " + i); 
			try { Thread.sleep(1000); } catch(Exception e) {} 
		} 
		System.out.println("Time’s up!"); 
} 
	
	public static void main(String[] args) { 
	new ExerciseMULTITHREADING12().start(); 
	} 
}