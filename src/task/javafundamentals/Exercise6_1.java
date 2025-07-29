package task.javafundamentals;

public class Exercise6_1 { 
	protected void finalize() { 
		System.out.println("Object collected!"); 
} 
	public static void main(String[] args) { 
		Exercise6_1 obj = new Exercise6_1(); 
		obj = null; 
		System.gc(); 
	} 
}