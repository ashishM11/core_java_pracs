package shallo_deep_copy_objects;

public class EmployeeAddress {
	
	private String buildingName;
	private String streetName;
	private String pinCode;
	private String state;
	
	
	public EmployeeAddress() {
		super();
	}


	public EmployeeAddress(String buildingName, String streetName, String pinCode, String state) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.state = state;
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "EmployeeAddress [buildingName=" + buildingName + ", streetName=" + streetName + ", pinCode=" + pinCode
				+ ", state=" + state + "]";
	}
	
}
