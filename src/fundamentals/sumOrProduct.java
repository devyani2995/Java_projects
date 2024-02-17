package fundamentals;
import java.util.Scanner;
public class sumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int sum=0,prod=1;
        
        for(int i=1;i<=N;i++) {
        	  if(C==1) {
        		  sum=sum+i;
        		  
        	  }else if(C==2) {
        		  prod=prod*i;
        		  
        	  }
        }
        if(C==1) {
        System.out.println(sum);
        }else if(C==2) {
        System.out.println(prod);
        
        }else {System.out.println("-1");}
	}

}
