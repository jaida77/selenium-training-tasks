package task.exceptionhandling;
//Base class
class VehicleE {
 final void engineType() {
     System.out.println("generic engine");
 }
}

//Subclass
class CarR extends VehicleE {
 //  this will cause a compile-time error
 /*
 void engineType() {
     System.out.println("petrol engine");
 }
 */
}

public class ExerciseEXCEPTIONHANDLING3_2 {
 public static void main(String[] args) {
     CarR obj = new CarR();
     obj.engineType();
 }
}
