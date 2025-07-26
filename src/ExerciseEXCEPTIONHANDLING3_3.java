
final class Constants {
    public static final double PI = 3.14;
    public void display() {
        System.out.println("this is a final class.");
    }
}

// attempting to extend final class
// this will cause a compile-time error
/*
class MyConstants extends Constants {
    // not allowed
}
*/

public class ExerciseEXCEPTIONHANDLING3_3 {
    public static void main(String[] args) {
        Constants obj = new Constants();
        obj.display();
    }
}
