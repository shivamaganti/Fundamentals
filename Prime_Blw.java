import java.util.Scanner;

public class Prime_Blw {

	public static void main(String[] args) {
		    
		    int num1=10,num2=99;
		    boolean flag = false;
		    for(int j=num1+1;j<num2;j++) {
		    	
		    for (int i = 10; i <= j / 2; ++i) {
		      // condition for nonprime number
		      if (j % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(j + " is a prime number.");
		    //else
		      //System.out.println(j + " is not a prime number.");
	}	
	}
   
}
