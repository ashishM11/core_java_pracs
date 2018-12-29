package star_pattern;

public class EQTriangle2 {
	
	/*
	  The below is desired pattern
	 
	   ******** 
	 	******
	 	 ***
	 	  *
	 */

	public static void main(String[] args) {
	
		//Count the number of rows, then print reverse right angle triangle.
		
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			
			for(int l=3;l>=i;l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
