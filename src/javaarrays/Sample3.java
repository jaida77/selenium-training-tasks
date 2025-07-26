package javaarrays;

public class Sample3 {
	static void sum(int[] arr) {
		int res=0;
		for(int i=0; i<arr.length;i++) {
			res+=arr[i];
		}
		System.out.println("sum of array elements are: " + res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {40,30,20,60,65};
		sum(arr);
	}

}
