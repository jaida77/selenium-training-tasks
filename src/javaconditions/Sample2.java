package javaconditions;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the percentage: ");
		int percentage = sc.nextInt();
		if(percentage>=85 && percentage <=100) {
			System.out.println("first class distinction");
		}
		if(percentage>=60 && percentage <85) {
			System.out.println("first class ");
		}
		if(percentage>=35 && percentage <60) {
			System.out.println("pass class");
		}
		if(percentage>=0 && percentage <35) {
			System.out.println("fail class");
		}
		else {
			System.out.println("enter percentage between 1 and 100");
		}
	}

}
