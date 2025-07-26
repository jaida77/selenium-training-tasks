package javathreads;


public class Sample1 extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj = new Sample1();
		obj.start();
	}

}
