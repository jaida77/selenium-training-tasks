package javathreads;
class isAliveThread extends Thread{
	public void run() {
		System.out.println("thread is running");
		try {
			Thread.sleep(300);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("thread execution done");
	}
	
}
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAliveThread obj1=new isAliveThread();
		isAliveThread obj2=new isAliveThread();
		obj1.start();
		obj2.start();
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		}

}
