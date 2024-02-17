/*
 * Q.You are given an integer array, arr, of size N and a positive integer K. Out of all subarrays of 'arr' of size K, find the sum of 
 * the subarray that has the maximum sum.
 * */
package CourseTest1;
import java.util.*;
public class maxSubArraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
           
           for(int i=0;i<n;i++) {
    	       arr[i]=sc.nextInt();
         }
           
//           int maxSum = 0;
//           for (int i = 0; i + k <= n; i++) {
//               int temp = 0;
//               for (int j = i; j < i + k; j++) {
//                   temp += arr[j];
//               }
//               if (temp > maxSum)
//            	   maxSum = temp;
//           }
//    
//           System.out.println(maxSum);
           
           if (n < k)
           {
              System.out.println("Invalid");
              return ;
           }
         
           // Compute sum of first window of size k
           int res = 0;
           for (int i=0; i<k; i++)
              res += arr[i];
         
           // Compute sums of remaining windows by
           // removing first element of previous
           // window and adding last element of
           // current window.
           int curr_sum = res;
           for (int i=k; i<n; i++)
           {
              curr_sum += arr[i] - arr[i-k];
              res = Math.max(res, curr_sum);
           }
         
           System.out.println(res);

	}
}
