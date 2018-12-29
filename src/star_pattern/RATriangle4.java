package star_pattern;

public class RATriangle4 {

	/*
	 	Need to achieve this pattern
	 	
	 		******
	  		 *****
	  		  ****
	  		   ***
	  		    **
	  		     *	
	 */
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<7;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=6;k>=i;k--) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
