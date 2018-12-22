package thread_banking;

public class BankingOperationsDAOImpl implements BankingOperationsDAO, Runnable {

	private Customers customer;
	private int amount;

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void checkBalance(Customers customer) {
		System.out.println("Your Current Balance is :" + customer.getCustAcc().getBalance());
	}

	@Override
	public void withdrawAmmount(Customers customer, int amount) {
		displayCustomerInfo(customer);
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
		synchronized(this) {
			withdrawAmmount(customer, amount);
		}
	}

	public void displayCustomerInfo(Customers customer) {
		System.out.println("Customer Name is :" + customer.getCustName());
		System.out.println("Customer Id is :" + customer.getCustId());
	}
}
