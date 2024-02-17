package Assignment_Recursion;

public class multiplyTwoIntegers {
	public static int multiplyTwoIntegers(int m, int n){
		
		// if m is less than 
        // n swap the numbers
		if (m < n)
            return multiplyTwoIntegers(n, m);
      
        // iteratively calculate 
        // n times sum of m
        else if (n != 0)
            return (m + multiplyTwoIntegers(m, n - 1));
      
        // if any of the two numbers is 
        // zero return zero
        else
            return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m=4,n=2;
        System.out.println(multiplyTwoIntegers(m,n));
	}

}
