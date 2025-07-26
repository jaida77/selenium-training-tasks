import java.util.*;
public class Exercise7_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.print("Enter an int: ");
        int i = sc.nextInt();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0); 

        System.out.print("Enter true or false: ");
        boolean flag = sc.nextBoolean();  

      
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
	}

}
