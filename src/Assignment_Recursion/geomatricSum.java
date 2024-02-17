/*
 * Q.Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
 * */
package Assignment_Recursion;
import java.text.DecimalFormat;
import java.util.*;
public class geomatricSum {
	public static double findGeometricSum(int k){
		// Write your code here
		if (k == 0)
            return 1;
 
        // calculate the sum each time
        double ans = 1 / (double)Math.pow(2, k) + findGeometricSum(k - 1);
 
        // return final answer
        return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}

}
