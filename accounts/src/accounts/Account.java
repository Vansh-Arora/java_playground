package accounts;
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  


//Method to initialize object  
//deposit method  

//withdraw method  
//method to check the balance of the account  
//method to display the values of an object  
//Creating a test class to deposit and withdraw amount  

public class Account {
	int accNo;
	String name;
	float balance;
	
	void enterDetails(int accNo, String name, float balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(float amt) {
		balance += amt;
		System.out.println(amt + " deposited");
	}
	
	void withdraw(float amt) {
		if(amt < balance) {
			balance -= amt;
			System.out.println(amt + " withdrawn");
		}
		else
			System.out.println("Insufficient balance");
	}
	
	void checkBalance() {
		System.out.println("Balance:" + balance);
	}
	
	void displayDetails() { System.out.println(accNo + " " + name + " " + balance);	}

}
