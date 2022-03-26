import java.util.Scanner;

public final class Check_last_Digit {
	
	public static void main(String args[]) {
	
	int num1, num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the two numbers:");
	
	// Reading the two int values through user.
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	// If the last digits are same then it prints True, else False will print
	if(num1%10 == num2%10) {
		
		System.out.println("True");
	}
	else {
		
	    System.out.println("False");
	}

   }
	
}
