package accounts;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
		acc1.enterDetails(122222, "Smith", 27000000);
		acc1.checkBalance();
		acc1.deposit(27000);
		acc1.checkBalance();
		acc1.withdraw(400000);
		acc1.checkBalance();
		acc1.displayDetails();
	}

}
