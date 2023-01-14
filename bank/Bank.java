package bankdetail;

public class Bank {
	long accNumber;
	String accName;
	double balance;
	public Bank() {
		accNumber = 1001;
		accName = "Man";
		balance = 1000000;
	}
	//parameterized constructor
	
	public Bank(long accNumber, String accName, double balance) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
	}

	public void withdraw(double amount){
		if (amount > 0 )
		{
			if (amount % 100==0) {
				if (amount > balance)
					throw new NullPointerException("Insufficient Funds");
				else {
					balance = balance - amount;
					System.out.println("current balance :"+balance);
				}
			}
			else
				throw new NullPointerException("amount should be multiples of hundreds");
			
		}
		else
			throw new NullPointerException("Amount should be non-zero");
	}


	public void deposit(double amount){
		if(amount > 0) {
			if (amount % 100 == 0) {
				balance = balance + amount;
				System.out.println("current balance :"+balance);
			}
				else
					throw new NullPointerException("amount should be multiples of hundreds");
				
			}
			else
				throw new NullPointerException("Amount should be non-zero");
			}
	public double getBalance() {
	return balance;
}

}

