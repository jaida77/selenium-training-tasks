package task.javafundamentals;
import java.util.Scanner;

public class Exercise10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		int[] arr= new int[10];
		int sum=0, avg=0;
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		System.out.println("enter the values: ");
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
			sum+=arr[i];
			if(arr[i]<min) {
				min= arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		avg=sum/10;
		System.out.println("sum of elements in the array: " + sum);
		System.out.println("average of elements in the array: " + avg);
		System.out.println("minimum value: " + min);
		System.out.println("maximum value: " + max);
		
	}

}