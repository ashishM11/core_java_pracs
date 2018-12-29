package abstract_interface_ex;

abstract class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public abstract void displayPersonInfo();
}

class Student extends Person{

	@Override
	public void displayPersonInfo() {
		System.out.println(this.getName() +" - "+this.getAge());
		
	}
	
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Person p=new Student();
		p.setName("Ashish");
		p.setAge(29);
		p.displayPersonInfo();
	}

}
