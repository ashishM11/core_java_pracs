package shallo_deep_copy_objects;

public class RunApp {

	public static void main(String[] args) {
		EmployeeAddress empAdd =new EmployeeAddress("Ramavtar Sadan","Cabin Road","401105","Maharashtra");
		Employee emp1 = new Employee("ace1","Ashish Tiwari","9167072373",empAdd);
		Employee empClone = null;
		try {
			 empClone= (Employee)emp1.clone();
			 if(empClone.getEmpAddress()==emp1.getEmpAddress()){
				System.out.println("empClone's empAddress reference equals emp's empAddress reference.");
			 }
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		empClone.getEmpAddress().setPinCode("401107");
		//empClone.setEmpAddress(new EmployeeAddress("Vastu Shrusti","Cabin raod","401105","Maharashtra"));
		System.out.println("I am cloned object:"+empClone.toString());
		System.out.println("I am real object:"+emp1.toString());
		
	}

}
