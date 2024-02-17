package patterns;

import java.util.Scanner;

public class pattern4 {
   public static void main(String[] args) {
	   Scanner scr = new Scanner(System.in);
       int n = scr.nextInt();
       
       int i=n;
       while(i>=1) {
    	   int j=1;
    	   while(j<=i) {
    		   System.out.print(i);
    		   j+=1;
    	   }
    	   System.out.println();
    	   i-=1;
    	   
       }
   }
}

