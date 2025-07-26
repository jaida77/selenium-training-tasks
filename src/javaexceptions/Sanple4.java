package javaexceptions;

public class Sanple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		System.out.println("start");
		try {
			System.out.println(name.length());
		}catch(NullPointerException ex) {
			System.out.println("exception arrised");
		}
		System.out.println("end");
	}

}
