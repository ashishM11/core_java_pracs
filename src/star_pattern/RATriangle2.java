package star_pattern;

public class RATriangle2 {

	/*
	 * 	     *
	 * 	    **
	 *     ***
	 *    ****
	 *   *****
	 *  ******
	 *  
	 *  This right angled triangle can be broken into 2 set 1 imaginary and other given pattern.
	 *  
	 */
	
	public static void main(String[] args) {
		
		for(int i=1;i<7;i++) {
			
			/*
			   This j loop will give me output like below but this is imaginary so replace it with space:
			  	*****
				****
				***
				**
				*
			 */
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			
			/*
			   This K loop will give me desired output.
			         *
				    **
				   ***
				  ****
				 *****
				******
			 */
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
