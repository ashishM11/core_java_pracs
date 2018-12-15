package serial_deserial_i_zation;

import java.io.Serializable;

public class Employee implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String name;
	private String id;
	private String email;
	private String mobile;

	public Employee(String name, String id, String email, String mobile) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.mobile = mobile;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
