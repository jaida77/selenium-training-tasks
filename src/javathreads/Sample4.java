package javathreads;

class Task1 implements Runnable{
	Task1(){
		System.out.println("thread: "+ Thread.currentThread().getName()+ "," +"state:new");
	}
	public void run(){
		System.out.println("thread: "+ Thread.currentThread().getName()+ "," +"state:running");
		for(int i=4; i>0;i--) {
			System.out.println("thread: "+ Thread.currentThread().getName()+ "," + i);
		}
		System.out.println("thread: "+ Thread.currentThread().getName()+ "," +"state:dead");
	}
}
public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Task1 obj=new Task1();
		Thread obj1=new Thread(new Task1(),"Scanning...");//thread named scanning is doing the task defined in task1()
		Thread obj2=new Thread(new Task1(),"Printing...");
		Thread obj3=new Thread(new Task1(),"Counting...");
		obj1.start();
		obj1.join();
		
		obj2.start();
		obj2.join();
		
		obj3.start();
		obj3.join();
	}

}
