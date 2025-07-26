package javathreads;

class Task extends Thread{
//	private Thread t;
	private String tName;
	
	Task(String name){
		tName=name;
		System.out.println("creating " + tName);
	}
	public void run() {
		System.out.println("running "+ tName);
		try{
			for(int i=4; i>0;i--) {
				System.out.println("thread: "+ tName + i);
				Thread.sleep(50);
			}
		}catch(InterruptedException ex) {
			System.out.println("thread "+ tName + " interrupted");
		}
		System.out.println("thread "+ tName+ " exiting");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1=new Task("thread-1 ");
		t1.start();
		
		Task t2=new Task("thread-2 ");
		t2.start();
	}

}
