package javaconditions;
import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {

		
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a day number: ");
				String day= sc.nextLine();
				switch(day) {
				case "one":
					System.out.println("monday");
					break;
				
				case "two":
					System.out.println("tuesday");
					break;
				
				case "three":
					System.out.println("wednesday");
					break;
					
				case "four":
					System.out.println("thursday");
					break;
					
				case "five":
					System.out.println("friday");
					break;
					
				case "six":
					System.out.println("saturday");
					break;
					
				case "seven":
					System.out.println("sunday");
					break;
					
				default:
					System.out.println("enter a number between 1 and 7");
					break;
					
				}

			}

		}


