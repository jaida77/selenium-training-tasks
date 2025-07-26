import java.util.*;
import java.util.stream.*;

public class ExerciseOOPS12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alaina", "jaida", "annie", "vishnu", "arun");

      
        System.out.println("all names:");
        names.forEach(name -> System.out.println(name));


        System.out.println("\names starting with A:");
        names.stream()
             .filter(name -> name.startsWith("a"))
             .forEach(name -> System.out.println(name));

        System.out.println("\nsorted names:");
        names.stream()
             .sorted()
             .forEach(name -> System.out.println(name));
    }
}
