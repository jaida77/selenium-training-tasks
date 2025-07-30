package javawrapperclass;
import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		Character ch='a';
		char c=ch;
		
		ArrayList<Character> al=new ArrayList<Character>();
		al.add(ch);
		System.out.println(al.get(0));
	}
}
