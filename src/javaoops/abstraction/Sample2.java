package javaoops.abstraction;

interface I1{
	void personalLoan();
	void studentLoan();
}

class SBI implements I1{
	public void personalLoan() {
		System.out.println("interest: 9%");
	}
	public void studentLoan() {
		System.out.println("interest: 8%");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		obj.personalLoan();
		obj.studentLoan();
	}

}
