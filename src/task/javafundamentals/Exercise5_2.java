package task.javafundamentals;

public class Exercise5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String input = args[0];  // First word from the command line
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
	}


