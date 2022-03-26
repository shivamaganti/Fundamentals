import java.util.Scanner;

public class Given_value {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

		
		//condition If the Character initialized with Alphabet.
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			
			System.out.println(ch+" is an Alphabet.");
		}
		
		//condition If the Character initialized with Number.
		else if(ch >= '0' && ch <= '9') {
			
			System.out.println(ch+" is a Number.");
		}

		else {
		
			System.out.println(ch+" is a Special Character.");
		}
	}

}
