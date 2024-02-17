package lecture13;
import java.util.*;
public class tripletSum {
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int count = 0;
		int n=arr.length;
        
        for(int i = 0; i<n-2; i++){
             // initialize left and right
            int l = i + 1;
            int r = n - 1;
            while ( l < r && r<n) {
                if (arr[i] + arr[l] + arr[r] == num) {
					count++;
					if(arr[r]!=arr[r-1]){
						l++;
                        r=n-1;
					} 
					else{
                        if(r-1==l){
                            l++;
                            r++;
                        }else
					   r--; 
					}
                }
                else if (arr[i] + arr[l] + arr[r] < num)
                    l++;
					
                else
                    r--;
            }
        }
         return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,6,7};
		int num=12;
		System.out.println(tripletSum(arr,num));
	}

}
