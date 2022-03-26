import java.util.Scanner;

public class Sum_Digits {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		int Reminder,i;
		for (i=0; num > 0;num=num/10)
		  {
		     Reminder = num % 10;
		     i = i+ Reminder;  
		  }
		System.out.println(i);
	}
}
