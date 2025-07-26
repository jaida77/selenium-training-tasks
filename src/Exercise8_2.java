
public class Exercise8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int x = 5;
	        System.out.println("Pre-increment: " + (++x)); // 6
	        System.out.println("Post-increment: " + (x++)); // 6 (prints then increments)
	        System.out.println("Now x = " + x); // 7
	        int num = 8; // binary: 1000
	        System.out.println("Left shift (num << 1): " + (num << 1));  // 16
	        System.out.println("Right shift (num >> 1): " + (num >> 1)); // 4
	        int a = 5, b = 10;
	        System.out.println("Bitwise &: " + (a & b)); // 0 (bitwise AND)
	        System.out.println("Logical &&: " + (a > 0 && b > 0)); // true (logical AND)
	}

}
