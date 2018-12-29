package star_pattern;

public class RATriangle3 {

	/*
		3rd Pattern:
		============
		******
		*****
		****
		***
		**
		*
	*/
	
	public static void main(String[] args) {
		
		for(int i=1;i<7;i++){
			
			/*
			 	This J loop will provide the desired output
			 
			 	******
				*****
				****
				***
				**
				*	 
			 */
			
			for(int j=6;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
