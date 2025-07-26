package javaarrays;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {80,50,60,30,70,65};
		System.out.println(marks.length);
		System.out.println(marks[4]);
		for(int i=0; i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		for(int i :marks) {
			System.out.println(i);
		}
	}

}
