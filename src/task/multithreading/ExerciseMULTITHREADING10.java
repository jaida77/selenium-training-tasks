package task.multithreading;

class Chat { 
    boolean turn = true; 
 
    synchronized void sayHi(String msg) { 
        while(!turn) { 
            try { wait(); } catch(Exception e) {} 
        } 
        System.out.println("Hi: " + msg); 
        turn = false; 
        notify(); 
    } 
 
    synchronized void sayHello(String msg) { 
        while(turn) { 
            try { wait(); } catch(Exception e) {} 
        } 
        System.out.println("Hello: " + msg); 
        turn = true; 
        notify(); 
    } 
} 
 
 
 
 
 
 
public class ExerciseMULTITHREADING10 { 
public static void main(String[] args) { 
	Chat chat = new Chat(); 
	new Thread(() -> { 
		chat.sayHi("How are you?"); 
		chat.sayHi("What’s up?"); 
	}).start(); 
	new Thread(() -> { 
		chat.sayHello("I’m good!"); 
		chat.sayHello("Working on Java."); 
	}).start(); 
	} 
} 