package lecture8;

import java.util.Scanner;

public class ncrCalculation {
    public static int factorial(int n) {
    	int fact = 1;
    	for(int i=1;i<=n;i++) {
    		fact*=i;
    	}
    	return fact;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int factN=factorial(n);
		int factR=factorial(r);
		int factNR=factorial(n-r);
		int result=factN/(factR * factNR);
		System.out.println(result);
	}

}
