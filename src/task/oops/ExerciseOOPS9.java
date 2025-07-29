package task.oops;
import model.Student;
import service.StudentService;

public class ExerciseOOPS9 {
    public static void main(String[] args) {
        Student s = new Student(1, "Jaida");
        StudentService service = new StudentService();
        
        service.saveStudent(s);
        service.printStudent(s);
    }
}