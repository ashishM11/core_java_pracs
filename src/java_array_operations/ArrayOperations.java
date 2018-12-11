package java_array_operations;

public class ArrayOperations {

	static String[] names= {"Ashish","Ace","Urvish","Lalit","Satyapal","",""};
	
	public static void main(String[] args) {
		System.out.println("**** Insertion of New Element ****");
		printArray(insertElementInArray(names,"Nayan",2));
		System.out.println("**** Deletetion of Element ****");
		printArray(deleteElementInArray(names,1));
		System.out.println("**** Replace new Element in names ****");
		printArray(replaceElementInArray(names, "Ashish","Ashish Tiwari"));
	}
	
	static String[] insertElementInArray(String[] names,String newName,int elementPosition) {
		for(int i=(names.length - 1);i>elementPosition;i--) {
			names[i]=names[i-1];
		}
		names[elementPosition] = newName;
		return names;
	}
	
	static String[] deleteElementInArray(String[] names,int position) {
		for(int i=position;i<(names.length-1);i++) {
			names[i]=names[i+1];
		}
		return names;
	}

	static String[] replaceElementInArray(String[] names,String existingName,String newName) {
		for(int i=0;i<names.length;i++) {
			if(existingName.equals(names[i])) {
				names[i] = newName;
			}
		}
		return names;
	}
	
	static void printArray(String[] names){
		for(String name:names) {
			System.out.println(name);
		}
		
	}
	
}
