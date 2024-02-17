//Q.write code for x^n using recursion method

package lecture14_Recursion1;

public class calculatePower {
   public static int calPower(int x,int n) {
	   if(n==0)
		   return 1;
	   return x * calPower(x,n-1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=2;
        int n=3;
        System.out.println(calPower(x,n));
	}

}
