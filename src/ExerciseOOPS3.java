class BankAccount{
	int accNum;
	private int balance;
	double initialBalance;
	BankAccount(int accNum, int initialBalance){
		this.accNum=accNum;
		this.balance=initialBalance;
	}
	void deposite(double amount){
		if(amount>0) {
			balance+=amount;
			System.out.println("amount credited: " + balance);
		}else {
			System.out.println("invalid amount");
		}
	}
	void withdraw(double amount){
		if(amount>0) {
			balance-=amount;
			System.out.println("amount debited: " + balance);
		}else {
			System.out.println("invalid amount");
		}
		
	}
	double getBalance() {
		return balance;
	}
}
public class ExerciseOOPS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount(13345,3000);
		obj.deposite(600);
		obj.withdraw(500);
		System.out.println("final account balance:"+ obj.getBalance());
	}

}
