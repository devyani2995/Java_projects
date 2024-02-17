package patterns;

import java.util.Scanner;
public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
	      int i=1;
	       
//	      while(i<=n) {
//	    	  int j=i;
//	    	  while(j>=1) {
//	    		  System.out.print(j);
//	    		  j-=1;
//	    	  }
//	    	  System.out.println();
//	    	  i+=1;
//	      }
	      
//	    while(i<=n) {
//		  int j=1;
//		  while(j<=i) {
//			  System.out.print(p);
//			  p=p+1;
//			  j+=1;
//		  }
//		  System.out.println();
//		  i+=1;
//	  }
	      
//		    while(i<=n) {
//			  int j=1;
//			  int p=i;
//			  while(j<=i) {
//				  System.out.print(p);
//				  p=p+1;
//				  j+=1;
//			  }
//			  System.out.println();
//			  i+=1;
//		  }
	      
//	     while(i<=n) {
//	    	 int j=1;
//	    	 while(j<=i) {
//	    		 char c= (char)('A'+i -1);
//	    		 System.out.print(c);
//	    		 j+=1;
//	    	 }
//	    	 System.out.println();
//	    	 i+=1;
//	     }
	      
		     while(i<=n) {
		    	 int j=1;
		    	 int p=n;
		    	 while(j<=i) {
		    		 
		    		 char c= (char)('A'+p);
		    		 System.out.print(c);
		    		 j+=1;
		    		 p-=1;
		    	 }
		    	 System.out.println();
		    	 i+=1;
		     }
	}

}
