package javawrapperclass;

class Max{
	private int max=0;
	private int size=0;
	
	void insert (int x) {
		this.size++;
		if(x<=this.max)
			return;
		this.max=x;
	}
	
	public int top() {
		return this.max;
	}
	
	public int elementNumber() {
		return this.size;
	}
}
	
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max m= new Max();
		m.insert(34);
		m.insert(54);
		m.insert(65);
		
		System.out.println("maximum ele: "+ m.top());
		System.out.println("number of elements "+ m.elementNumber());
	}

}
