package javathreads;

public class Sample2 implements Runnable{
	Sample2(){
		System.out.println("before run()");
	}
	
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj=new Sample2();
		Thread t1=new Thread(obj); //or Thread obj=new Thread(new Sample2());
		t1.start();
	}

}
