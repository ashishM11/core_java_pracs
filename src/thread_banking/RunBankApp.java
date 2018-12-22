package thread_banking;

public class RunBankApp {

	static BankingOperationsDAOImpl bankOps = null;

	public RunBankApp() {
		super();
		bankOps = new BankingOperationsDAOImpl();
	}

	public static void main(String[] args) {
		RunBankApp runApp=new RunBankApp();
		Account acc = new Account(1000);

		Customers cust1 = new Customers();
		Customers cust2 = new Customers();

		cust1.setCustId(100);
		cust1.setCustName("Ashish");
		cust1.setCustAcc(acc);

		cust2.setCustId(200);
		cust2.setCustName("Lalit");
		cust2.setCustAcc(acc);

		Thread custThread1 = new Thread(bankOps);
		Thread custThread2 = new Thread(bankOps);
		custThread1.start();
		custThread2.start();
		bankOps.displayCustomerInfo(cust1);
		bankOps.displayCustomerInfo(cust2);

	}
}
