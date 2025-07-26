package javaoops;

		

public class Counter {
	static int count=0; //if we dont make it static the o/p will be 1 1 1 
	Counter(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		
	}

}
