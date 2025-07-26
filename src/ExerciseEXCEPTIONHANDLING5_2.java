import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseEXCEPTIONHANDLING5_2 {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(new File("data.txt")); // file must exist
            System.out.println("reading file:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        } finally {
            if (sc != null) {
                sc.close();
                System.out.println("scanner closed.");
            }
        }
    }
}
