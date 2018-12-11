package shallo_deep_copy_objects;

public class Employee implements Cloneable{
	
	private String empId;
	private String empName;
	private String mobileNo;
	private EmployeeAddress empAddress;
	
	
	
	public Employee() {
		super();		
	}


	public Employee(String empId, String empName, String mobileNo, EmployeeAddress empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.empAddress = empAddress;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", empAddress="
				+ empAddress + "]";
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Employee empClone =(Employee)super.clone();
		EmployeeAddress empAdd = new EmployeeAddress(this.getEmpAddress().getBuildingName(),
				this.getEmpAddress().getStreetName(),this.getEmpAddress().getPinCode(),this.getEmpAddress().getState());
		empClone.setEmpAddress(empAdd);
		return empClone;
	}
	
	
			
}
