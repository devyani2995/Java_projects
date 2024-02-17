package lecture13;

import java.util.Arrays;

public class findUnique {
	public static int findUnique(int[] arr) {
	
			//Your code goes here
			int res = arr[0]; 
	        for (int i = 1; i < arr.length; i++) 
	            res = res ^ arr[i]; 
	      
	        return res; 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,3,1,3,6,6,7,10,7};
         System.out.println(findUnique(arr));
	}

}
