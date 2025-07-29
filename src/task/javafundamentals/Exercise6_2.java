package task.javafundamentals;

public class Exercise6_2 { 
	public static void main(String[] args) { 
		for (int i = 0; i < 1000; i++) { 
			int[] data = new int[1000000]; 
		} 
		System.gc(); 
		System.out.println("Requested GC"); 
	} 
} 