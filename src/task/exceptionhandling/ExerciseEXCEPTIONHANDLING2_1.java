package task.exceptionhandling;

interface RemoteControl { 
	
	void turnOn(); 
	default void batteryStatus() { 
		System.out.println("battery is 40%"); 
	} 

} 
class TV implements RemoteControl { 
	public void turnOn() { 
		System.out.println("TV is turned on."); 
	} 
} 

public class ExerciseEXCEPTIONHANDLING2_1 { 
	public static void main(String[] args) { 
		TV obj = new TV(); 
		obj.turnOn(); 
		obj.batteryStatus(); 
} 
} 