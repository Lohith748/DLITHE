package bankdetail;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank customer1 = new Bank(1001,"Lohith",1000);
		customer1.deposit(500);//deposit amount
		customer1.withdraw(100);// withdraw amount
		System.out.println("Balance:" +customer1.getBalance());
		

	}

}
