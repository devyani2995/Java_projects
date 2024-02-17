package lecture8;

import java.util.Scanner;

public class checkPrimeNumber {
    public static boolean checkPrime(int n) {
    	int div=2;
    	while(div<=n/2) {
    		if(n%div==0) {
    			//not prime
    			return false;
    		}
    		div+=1;
    	}
    	return true;
    }
    
    public static boolean checkPrime2(int n) {
    	int div=2;
    	boolean isPrime=true;
    	while(div<=n/2) {
    		if(n%div==0) {
    			//not prime
    			isPrime=false;
    			break;
    		}
    		div+=1;
    	}
    	return isPrime;
//    	if(isPrime) {
//    		return true;
//    	}else {
//    		return false;
//    	}
    }
    public static boolean isPrime(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner s= new Scanner(System.in);
//	      int n= s.nextInt();
//	      boolean isPrime = checkPrime2(n);
//	      System.out.println(isPrime);
	    System.out.print(isPrime(47));
	     }

}
