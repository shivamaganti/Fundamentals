import java.util.Scanner;

public class Odd_Even {
	public static void main(String args[]) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		
		num = sc.nextInt();
		
		// If the given Number Divides with the 2 then it's a Even ,Else Odd.
		
		if(num %2 == 0) {
			
			System.out.println("The Given Integer is Even Number");
			
		}
		
		if(num %2 != 0) {
			
			System.out.println("The Given Integer is Odd Number");
		}
	}

}
