package javaoops.abstraction;

abstract class RBI{
	void studentLoan() {
		System.out.println("interest : 5%");
	}
	abstract void personalLoan();
}

class HDFC extends RBI{
	void personalLoan() {
		System.out.println("interest: 8%");
	}
}
class YesBank extends RBI{
	void personalLoan() {
		System.out.println("interest: 9%");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YesBank obj = new YesBank();
		obj.personalLoan();
		obj.studentLoan();
	}

}
