package task.oops;

interface Logger { 
	
default void logInfo() { 
	System.out.println("default log"); 
	} 

static void logError() { 
	System.out.println("static log"); 
	} 
} 

class AppLogger implements Logger {} 
public class ExerciseOOPS10 { 
	public static void main(String[] args) { 
		AppLogger obj = new AppLogger(); 
		obj.logInfo(); 
		Logger.logError();
	} 
} 