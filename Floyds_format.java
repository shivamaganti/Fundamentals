
public class Floyds_format {
	
	public static void main(String args[]) {
		
		int i,j,n=3;
		
		//code for printing stars.
		for (i = 1; i <= n; i++) {
			 
            // Inner loop for columns
            for (j = 1; j <= i; j++) {
 
                // Printing value to be displayed
                System.out.print( "*");
            }
 
            // Print elements of next row
            System.out.println();
	    }
	}
}
