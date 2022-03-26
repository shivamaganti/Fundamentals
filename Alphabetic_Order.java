import java.util.Scanner;

public class Alphabetic_Order {

	public static void main(String[] args) {
		
		String a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Characters:");
		
		a = sc.nextLine();
		b = sc.nextLine();
		
		if(a.charAt(0) < b.charAt(0)) {
			System.out.println(a+""+b);
		}
		else {
			System.out.println(b+""+a);
		}
	}

}
