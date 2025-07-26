package javaexceptions;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {30,59,35,54,31};
		System.out.println("start");
		try {
			System.out.println(marks[6]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndexOutOfBoundsException occured");	
		}
	}

}
