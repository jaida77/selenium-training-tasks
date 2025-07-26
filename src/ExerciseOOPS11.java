@FunctionalInterface 
interface MathOperation { 
	int operate(int a, int b); 
	
} 
public class ExerciseOOPS11 { 
	public static void main(String[] args) { 
		MathOperation obj1 = (a, b) -> a + b; 
		MathOperation obj2= (a, b) -> a - b; 
		MathOperation obj3= (a, b) -> a * b; 
		System.out.println("add: " + obj1.operate(7, 9)); 
		System.out.println("sub: " + obj2.operate(50, 25)); 
		System.out.println("mul: " + obj3.operate(30, 45)); 
} 
} 