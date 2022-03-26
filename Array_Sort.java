import java.util.Scanner;

public class Array_Sort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();  
			//Reding the input from the user
			}
		
		//sorting the array.
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
			}
		System.out.println(" ");
	}

}
