package hash_equals_pracs;

import java.util.HashSet;

public class RunApp {

	public static void main(String[] args) {
		Employee emp1= new Employee("Ashish Tiwari","ashish11011991@gmail.com","9167072373");
		Employee emp2= new Employee("Eminem","ashish.mano11@gmail.com","7718838665");
		
		HashSet<Employee> empHashSet = new HashSet<>();
		empHashSet.add(emp1);
		empHashSet.add(emp2);
		
		Employee empREM = new Employee("Eminem","ashish.mano11@gmail.com","7718838665");
		//empHashSet.forEach(System.out::println);
		//System.out.println("emp2 obj == empREM =>"+emp2.equals(empREM));
		//System.out.println("IS EMINEM REMOVED => "+empHashSet.remove(empREM));
		
		
		/* Hash-code for emp2 and empREM 
		System.out.println(" Employee 2 object hashcode => "+emp2.hashCode());
		System.out.println(" Employee REM object hashcode => "+empREM.hashCode());
		empHashSet.forEach(System.out::println);*/

		
		
		/* -------- Equals Contract Statement ----------*/
		System.out.println("Object is reflexive. x.equals(x) should return true => "+emp2.equals(emp2));
		System.out.println("It is symmetric.x.equals(y) should return true => "+emp2.equals(empREM) +"\t if and only if y.equals(x) returns true. => "+empREM.equals(emp2));
		
		Employee empREMRefCopy =  empREM;
		System.out.println("It is transitive.If x.equals(y) returns "+emp2.equals(empREM)+" and y.equals(z) returns "+empREM.equals(empREMRefCopy)+", \t then x.equals(z) should return "+emp2.equals(empREMRefCopy));
		
		
	}

}
