package task.exceptionhandling;

public class ExerciseEXCEPTIONHANDLING5_3 {

    // Method that declares it might throw an exception
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("age must be 18 or above");
        } else {
            System.out.println("age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  
        } catch (Exception ex) {
            System.out.println("exception caught: " + ex.getMessage());
        }
    }
}
