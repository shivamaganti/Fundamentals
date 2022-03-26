import java.util.Arrays;
import java.util.Scanner;

public class Array_Small_Large {

	public static void main(String[] args) {
		
		int[] arr = {12, 14,11,2,3,15,63,96};
		
		//Arrays.sort(arr);
		
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
        System.out.println("Max1= "+arr[7]+" Max2= "+arr[6]);
        System.out.println("Min1= "+arr[0]+" Min2= "+arr[1]);
	
	}
}
