package javaoops;
	
public class Counter {
	static int count=0; //if we don't make it static the o/p will be 1 1 1 
	Counter(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		
	}

}
