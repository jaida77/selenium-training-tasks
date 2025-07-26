interface RemoteControll { 
	
	void turnOn(); 
	default void batteryStatus() { 
		System.out.println("battery is 40%"); 
	} 
	static void info() {
		System.out.println("inside info method");
	}

} 
class Tv implements RemoteControll { 
	public void turnOn() { 
		System.out.println("TV is turned on."); 
	} 
} 

public class ExerciseEXCEPTIONHANDLING2_2 { 
	public static void main(String[] args) { 
		Tv obj = new Tv(); 
		obj.turnOn(); 
		obj.batteryStatus(); 
		RemoteControll.info();
} 
} 