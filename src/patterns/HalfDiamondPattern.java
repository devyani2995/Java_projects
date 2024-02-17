package patterns;
import java.util.Scanner;
public class HalfDiamondPattern {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
	       int n = scr.nextInt();
	       
	       int i=1;
	      System.out.println("*");
	      while(i<=n) {
	    	  int j=1;
	    	  System.out.print("*");
	    	  while(j<=i) {
	    		  System.out.print(j);
	    		  j++;
	    	  }
	    	  j=i-1;
	    	  while(j>=1) {
	    		  System.out.print(j);
	    		  j--;
	    	  }
	    	  
	    	  System.out.print("*");
	    	  System.out.println();
	    	  i++;
	      }
	      
	      i=n-1;
	      while(i>=1) {
	    	  int j=1;
	    	  System.out.print("*");
	    	  while(j<=i) {
	    		  System.out.print(j);
	    		  j++;
	    	  }
	    	  
	    	  j=i-1;
	    	  while(j>=1) {
	    		  System.out.print(j);
	    		  j--;
	    	  }
	    	  System.out.print("*");
	    	  System.out.println();
	    	  i--;
	      }
	      System.out.print("*");
	}
}
