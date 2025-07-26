import java.util.*;
public class Exercise9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
	        System.out.print("Choose option (1-4): ");
	        int choice = sc.nextInt();

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        switch (choice) {
	            case 1 :
	            	System.out.println("Sum = " + (a + b));
	            	break;
	            case 2 :
	            	System.out.println("Difference = " + (a - b));
	            	break;
	            case 3 :
	            	System.out.println("Product = " + (a * b));
	            	break;
	            case 4 :
	            	System.out.println("Quotient = " + (a / b));
	            	break;
	            default :
	            	System.out.println("Invalid choice!");
	            	break;
	        }
	}

}
