package serial_deserial_i_zation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class RunDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Employee> empList = new ArrayList<>();
		
		FileInputStream fileInputStream = new FileInputStream("/Users/ashisht/git/core_java_pracs/src/serial_deserial_i_zation/employeeObject.txt");
		ObjectInputStream oIS = new ObjectInputStream(fileInputStream);
		boolean isObjectPresent = true;
		while(isObjectPresent) {
			if(null != oIS.readObject()) {
				Employee emp = (Employee) oIS.readObject();
				empList.add(emp);
			}else {
				isObjectPresent = false;
			}
		}
		
		oIS.close();
		fileInputStream.close();
		System.out.println("Deserialization completed");
		
		for(Employee emp:empList) {
			System.out.println("Emp name : "+emp.getName());
		}
		
	}

}
