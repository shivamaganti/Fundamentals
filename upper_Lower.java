import java.util.Scanner;

public class upper_Lower {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
        	
        	char val1 = (char) (ch + 32);
        	System.out.println(ch+" -> "+val1);
        }
     
        else if (ch >= 'a' && ch <= 'z') {
        
        	char val = (char) (ch - 32);
        	System.out.println(ch+" -> "+val);
        }
     

	}

}
