package task.javafundamentals;
import java.util.Scanner;

public class Exercise9_4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a positive number (1 to stop): ");
	            num = sc.nextInt();
	            System.out.println("number entered is: " + num);
	        } while (num != 1);

	        System.out.println("Program ended as 1 was entered.");
	    }
	

}
