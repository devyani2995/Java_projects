package fundamentals;
import java.util.*;
import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int b[] = new int[40];
        
        int i=0;
        if(n==0) {
        	System.out.println(n);
        }
        while(n>0) {
        	b[i]=n%2;
        	n=n/2;
        	i++;
        }
        
        for(int j=i-1;j>=0;j--) {
        	System.out.println(b[j]);
        }
	}

}
