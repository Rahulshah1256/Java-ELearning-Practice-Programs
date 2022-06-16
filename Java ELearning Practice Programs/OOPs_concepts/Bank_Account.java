package OOPs_concepts;

public class Bank_Account {
	
	private long accNo;
	private String accName;
	private double accBalance;
	
	public void deposit(double amt) {
		if(amt>0) {
			accBalance=accBalance+amt;
			System.out.println("Successfully Deposited $ "+amt);
		}else {
			System.out.println("Cannot deposit "+amt);
		}
	}
	
	public void withdraw(double amt) {
		if(amt>0) {
			accBalance=accBalance-amt;
			System.out.println("Successfully withdrawn $ "+amt);
		}else {
			System.out.println("Cannot withdrawn "+amt);
		}
		
	}
	public void displayCurrentBalance() {
		System.out.println("Your current balance is $ "+accBalance);
	}
	
	public Bank_Account(long accNo, String accName, double accBalance) {
		this.accNo=accNo;
		this.accName=accName;
		this.accBalance=accBalance;
	}

}
