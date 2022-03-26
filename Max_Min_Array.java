import java.util.Scanner;

public class Max_Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int min, max;
		System.out.println("Enter the elements of the array:");
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();  
			//Reding the input from the user
			}
		min = max = arr[0];
		for(int j=0;j<n;j++) {
			if(min > arr[j]) {
				min = arr[j];
			}
			else {
				max = arr[j];
			}
		}
	    System.out.println(max+" Maximum \n"+min+" Minimum");
	}
	

}
