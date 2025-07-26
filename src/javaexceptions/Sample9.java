package javaexceptions;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class Sample9 {
	static void validate (int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age must be above 18");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}catch(InvalidAgeException ex) {
			System.out.println("exception occured, "+ ex.getMessage());
		}
	}

}
