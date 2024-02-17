package fundamentals;
import java.util.Scanner;
public class HelloWorld {
 public static void main(String args[]) { 
//	 Scanner s= new Scanner(System.in);
//      int n= s.nextInt();
//      int i=1;
       
//      while(i<=n) {
//    	  int j=1;
//    	  while(j<=n) {
//    		  System.out.print(n);
//    		  j+=1;
//    	  }
//    	  System.out.println();
//    	  i+=1;
//      }
      
//    while(i<=n) {
//	  int j=1;
//	  while(j<=i) {
//		  System.out.print(i);
//		  j+=1;
//	  }
//	  System.out.println();
//	  i+=1;
//  }
      
	 int i = 1;
	 while(i < 3) {
	     int j = 0;
	     while(j < 5) {
	         j++;
	         if(j == 3) {
	             continue;
	         }
	         System.out.print(j + " ");
	     }
	     i++;
	 }

 }
}