package patterns;

import java.util.Scanner;

public class isoscelesPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
	       int n = scr.nextInt();
	       
	       int i=1;
	      
	       while(i<=n) {
	    	   int space=1;
	    	   while(space<=n-i) {
	    		   System.out.print(" ");
	    		   space+=1;
	    	   }
	    	   int j=1;
	    	   int p=i;
	    	   while(j<=i) {
	    		   System.out.print(p);
	    		   j+=1;
	    		   p+=1;
	    		  
	    	   }
	    	   
	    	   int dec=i-1;
	    	   while(dec>=1) {
	    		   System.out.print(dec+i-1);
	    		   dec-=1;

	    	   }
	    	   System.out.println();
	    	   i+=1;
	    	   
	       }

	}

}
