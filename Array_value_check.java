import java.util.Scanner;

public class Array_value_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();  
			//Reding the input from the user
			}
		System.out.println("Enter the value to check in the array:");
		int ele = sc.nextInt();
		int check = -1;
		
		//check the given value is in the array.
		for(int j=0; j<n;j++) {
			if(ele == arr[j]) {
				check = ele;
			}
		}
	     System.out.println(check);
	}

}
