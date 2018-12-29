package thread_banking;

public class RunBankApp {

	public static void main(String[] args) throws InterruptedException{
		RunBankApp runApp = new RunBankApp();
		Account acc = new Account(1000);

		Customers cust1 = new Customers(100, "Ashish", acc);
		Customers cust2 = new Customers(200, "Lalit", acc);
		
		BankingOperationsDAOImpl bankOps1 = new BankingOperationsDAOImpl(cust1,600);
		BankingOperationsDAOImpl bankOps2 = new BankingOperationsDAOImpl(cust2,1200);
		Thread custThread1 = new Thread(bankOps1);
		Thread custThread2 = new Thread(bankOps2);
		synchronized (custThread1) {
			custThread1.start();
			custThread1.wait();
		}
		synchronized (custThread2) {
			custThread2.start();
			custThread2.wait();
		}
		
	}
}
