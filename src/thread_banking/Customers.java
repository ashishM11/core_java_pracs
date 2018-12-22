package thread_banking;

public class Customers {

	private int custId;
	private String custName;
	private Account custAcc;
	
	public Customers() {
		super();
	}

	public Customers(int custId, String custName, Account custAcc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAcc = custAcc;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Account getCustAcc() {
		return custAcc;
	}

	public void setCustAcc(Account custAcc) {
		this.custAcc = custAcc;
	}
	
}
