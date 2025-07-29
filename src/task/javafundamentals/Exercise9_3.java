package task.javafundamentals;

public class Exercise9_3 {
	    public static void main(String[] args) {
	        int count = 0, num = 2;

	        while (count < 10) {
	            boolean isPrime = true;

	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	                count++;
	            }

	            num++;
	        }
	    }
	}


