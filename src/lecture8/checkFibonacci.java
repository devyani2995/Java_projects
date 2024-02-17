package lecture8;

import java.util.Scanner;

public class checkFibonacci {
	public static boolean checkFibonacci(int n) {
		int a=0;
	     int b=1;
		while(a<n) {
			int c=a+b;
			a=b;
			b=c;
		}
		if(a==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) { 
		 Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     boolean result=checkFibonacci(n);
     System.out.println(result);
	}
}
