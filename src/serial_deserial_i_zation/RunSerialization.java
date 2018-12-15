package serial_deserial_i_zation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RunSerialization {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee("Ashish Tiwari","ashish662479","ashish1tiwari@outlook.com","9167072373");
		Employee emp2 = new Employee("ACE","ace11","ashish.mano11@outlook.com","7718838665");

		FileOutputStream empFileObj = new FileOutputStream("/Users/ashisht/git/core_java_pracs/src/serial_deserial_i_zation/employeeObject.txt");
		ObjectOutputStream objOS = new ObjectOutputStream(empFileObj);
		objOS.writeObject(emp1);
		objOS.writeObject(emp2);
		objOS.close();
		empFileObj.close();
		
		System.out.println("Serialization is done and completed.");
	}

}
