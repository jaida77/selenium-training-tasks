package javaconditions;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day number: ");
		int day= sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		
		case 2:
			System.out.println("tuesday");
			break;
		
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thursday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
		default:
			System.out.println("enter a number between 1 and 7");
			break;
			
		}

	}

}
