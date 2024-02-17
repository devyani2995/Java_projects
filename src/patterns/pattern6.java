/*
1234554321
1234**4321
123****321
12******21
1********1

where N=5
*/
package patterns;
import java.util.*;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
   int i,j;
   for(i=n;i>=1;i--) {
	    for(j=1;j<=n;j++) {
	    	if(j<=i) {
	    		System.out.print(j);
	    	}else {
	    		System.out.print("*");
	    	}
	    }
	    for(int k=n;k>=1;k--) {
	    	if(k<=i) {
	    		System.out.print(k);
	    	}else {
	    		System.out.print("*");
	    	}
	    }
	    System.out.println();
   }
	}

}
