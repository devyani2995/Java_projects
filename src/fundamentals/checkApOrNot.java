package fundamentals;
import java.util.Scanner;
import java.util.Scanner;

public class checkApOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isAp=true;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
//		for(int i=1;i<n;i++){
//
//		   if(a[i-1]>a[i]){
//		      int temp=a[i-1];
//		      a[i-1]=a[i];
//		      a[i]=temp;
//		      i=0;
//		    }
//		}
		int d=a[1]-a[0];
		
		for(int i=1;i<n;i++){

	    	int x=a[i]-a[i-1];
            isAp=(d==x)?true:false;
           if(isAp==false) {
        	   break;
           }
	    	
		}
		
		if(isAp) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
