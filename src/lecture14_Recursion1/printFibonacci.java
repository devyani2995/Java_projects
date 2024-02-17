package lecture14_Recursion1;

public class printFibonacci {
	public static int nthFibNumber(int n) {
		if(n==1 || n==2)
			return 1;
		
		return nthFibNumber(n-1) + nthFibNumber(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=4;
          System.out.println(nthFibNumber(n));
	}

}
