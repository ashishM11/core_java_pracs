package star_pattern;

public class EQTriangle1 {

	/*
	  The below is desired pattern:
	  
			  		*
			  	 *	*  *
			  *	 *  *  *  *
			* *	 *  *  *  *  *
	  
	 */
	
	public static void main(String[] args) {
		/*
		 * The above pattern needs to be broken 3 loops
		 */
		
		for(int i=1;i<5;i++) {
			
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
