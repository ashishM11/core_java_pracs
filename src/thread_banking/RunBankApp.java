package thread_banking;

public class RunBankApp {

	public static void main(String[] args) {
		RunBankApp runApp = new RunBankApp();
		Account acc = new Account(1000);

		Customers cust1 = new Customers(100, "Ashish", acc);
		Customers cust2 = new Customers(200, "Lalit", acc);
		
		BankingOperationsDAOImpl bankOps1 = new BankingOperationsDAOImpl();
		bankOps1.setCustomer(cust1);
		bankOps1.setAmount(700);

		BankingOperationsDAOImpl bankOps2 = new BankingOperationsDAOImpl();
		bankOps2.setCustomer(cust2);
		bankOps2.setAmount(1200);
		
		Thread custThread1 = new Thread(bankOps1);
		Thread custThread2 = new Thread(bankOps2);
		custThread1.start();
		custThread2.start();
	}
}
