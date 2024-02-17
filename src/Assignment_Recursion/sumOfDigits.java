package Assignment_Recursion;

public class sumOfDigits {
	public static int sumOfDigits(int input){
		// Write your code here
		 if (input == 0)
	            return 0;
	     return (input % 10 + sumOfDigits(input / 10));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n= 12345;
           System.out.println(sumOfDigits(n));
	}

}
