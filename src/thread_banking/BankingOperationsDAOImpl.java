package thread_banking;

public class BankingOperationsDAOImpl implements BankingOperationsDAO, Runnable {

	@Override
	public void checkBalance(Customers customer) {
		System.out.println(customer.getCustAcc().getBalance());
	}

	@Override
	public void withdrawAmmount(Customers customer, int amount) {
		if (isBalanceSufficient(customer, amount)) {
			customer.getCustAcc().setBalance(customer.getCustAcc().getBalance() - amount);
			checkBalance(customer);
		} else {
			System.out.println("Sorry Balace is not sufficient for given amount: " + amount);
		}
	}

	@Override
	public boolean isBalanceSufficient(Customers customer, int amount) {
		return (customer.getCustAcc().getBalance() > amount);
	}

	@Override
	public void run() {
		Customers customer = null;
		int amount = 0;
		withdrawAmmount(customer, amount);
	}

	public void displayCustomerInfo(Customers customer) {
		System.out.println("Customer Name is :"+customer.getCustName());
		System.out.println("Customer Id is :"+customer.getCustId());
	}

}
