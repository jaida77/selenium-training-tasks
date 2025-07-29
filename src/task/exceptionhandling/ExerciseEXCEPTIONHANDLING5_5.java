package task.exceptionhandling;
//Custom Exception class
class InvalidAccountException extends Exception {
 public InvalidAccountException(String message) {
     super(message);
 }
}

public class ExerciseEXCEPTIONHANDLING5_5 {

 // Method to check account balance
 static void checkBalance(double balance) throws InvalidAccountException {
     if (balance < 0) {
         throw new InvalidAccountException("Account balance cannot be negative!");
     } else {
         System.out.println("Balance is valid: " + balance);
     }
 }

 public static void main(String[] args) {
     try {
         checkBalance(-1000); //negative balance
     } catch (InvalidAccountException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
