import java.util.Scanner;

public class Array_sum_avg {

	public static void main(String A[]) {
		
		int sum = 0, avg; //len; //a[] = {1,2,3,4,5};
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();  
			//Reding the input from the user
			}
		
		for(int j : arr) {
		    sum = sum + j;
			//Adding the each element to the sum.
		}
		avg = sum/n;    //avg of the sum
		System.out.println("Sum:"+sum+" Average:"+avg);
	}

}
