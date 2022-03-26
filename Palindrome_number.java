import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int d, number,temp, revnum = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	      temp = number;
	      while (temp >0) {
	         d = temp %10;
	         revnum = (revnum*10)+d;
	         temp = temp/10;
	      }
	      if(revnum == number) {
	    	  System.out.println(number+" is a palindrome number.");
	      }
	      else {
	    	  System.out.println(number+" is not a palindrome number.");
	      }
	}

}
