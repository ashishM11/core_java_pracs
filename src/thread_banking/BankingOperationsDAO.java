package thread_banking;

public interface BankingOperationsDAO {

	public void checkBalance(Customers customer);
	public void withdrawAmmount(Customers customer,int amount);
	public boolean isBalanceSufficient(Customers customer,int amount);
	public void displayCustomerInfo(Customers customer);
}
