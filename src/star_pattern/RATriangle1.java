package star_pattern;

public class RATriangle1 {

	/*
	 * 	*
	 * 	**
	 *  ***
	 *  ****
	 *  *****
	 *  ******
	 */
	
	public static void main(String[] args) {
		
		//Step 1: count the number rows i.e (6)
		
		for(int i=1;i<7;i++) {
			//Step 2: check column pattern for *
			for(int j=1;j<=i;j++) {
				//Step 3: Print *
				System.out.print("*");
			}
			
			//Step 4: next line after star is printed.
			System.out.println();
		}
		
	}

}
