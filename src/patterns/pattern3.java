package patterns;

import java.util.Scanner;

public class pattern3 {
   public static void main(String[] args) {
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
    	   while(j<=i) {
    		   System.out.print(j);
    		   j+=1;
    	   }
    	   System.out.println();
    	   i+=1;
    	   
       }
   }
}
