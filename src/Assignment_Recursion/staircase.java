package Assignment_Recursion;

public class staircase {
	  public static int staircase(int n){
		  if ( n == 0)
	            return 1;
	        else if (n < 0)
	            return 0;
	 
	        else
	            return staircase(n - 3) + staircase(n - 2) + staircase(n - 1);
		        
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=4;
     System.out.println(staircase(n));
	}

}
