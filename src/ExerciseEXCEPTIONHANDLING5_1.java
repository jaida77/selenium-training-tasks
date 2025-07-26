import java.util.Scanner;

public class ExerciseEXCEPTIONHANDLING5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to divide 100: ");

        try {
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("error: cannot divide by zero.");
        }

        sc.close();
    }
}
