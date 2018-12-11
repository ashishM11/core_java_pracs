package hash_equals_pracs;

class Test{
	
	public String name,email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Test(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	Test(){}
	
}

public class HashEqualsExample1 {

	public static void main(String[] args) {
		Test t1=new Test("Ashish","tiwashi11@gmail.com");
		Test t2=new Test("Ashish","tiwashi11@gmail.com");
		System.out.println(t1.equals(t2));
		System.out.println(t1.getName().equals(t2.getName()));
		System.out.println(t1.getName()==t2.getName());
		System.out.println(t1==t2);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
