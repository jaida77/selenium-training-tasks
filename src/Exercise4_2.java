public class Exercise4_2{
	
	static final int MAX=100;
//	int class=34; cannot use keyword as a variable name.
	
	void display(int res, boolean isPositive) {
		System.out.println("value is: " + res);
		System.out.println("is positive: " + isPositive);
	}
	public static void main(String[] args) {
		int res, a=50, b=30;
		
		if(a>b) {
			res=a-b;
		}else {
			res=b-a;
		}
		
		boolean isPositive= res>0;
		
		for(int i=1;i<=3;i++) {
			System.out.println(i);
		}
		
		try {
			if(res==0) {
				System.out.println("result is zero");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		Exercise4_2 obj = new Exercise4_2();
		obj.display(res,isPositive);
	}
}