package task.multithreading;

class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("thread is running");
		}catch(Exception ex) {
			System.out.println("thread interrupted");
		}
	}
}
public class ExerciseMULTITHREADING4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		
		System.out.println("before start: " +t.isAlive());
		t.start();
		System.out.println("after start: " +t.isAlive());
		
		try {
			t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("After join: " + t.isAlive()); 
	}

}
