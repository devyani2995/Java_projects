package Test4;
import java.util.*;
public class maxProfit {
	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
        /*for (int i=0;i<budget.length;i++)
        {
            System.out.print(budget[i]+" ");
        }*/
        //System.out.println();
        
        int maxProfit=Integer.MIN_VALUE;
        int n=budget.length;
        // sort(budget,budget+n);
    	for(int i=0;i<n;i++)
    	{
    		maxProfit=Math.max(maxProfit,budget[i]*(n-i));
    	}
    	return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int noOfSubscriber = 4;
       int[] budget= {30,20,53,14};
       System.out.println(maximumProfit(budget));
	}

}
