package javaconditions;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age= sc.nextInt();
//		int age=18;
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
	}

}
