package Test4;

public class minCount {
	public static int minCount(int n){
		 if (n <= 3)
	            return n;
	 
	        // minCount rest of the
	        // table using recursive
	        // formula
	        // Maximum squares required is
	        int count = n;
	        // n (1*1 + 1*1 + ..)
	 
	        // Go through all smaller numbers
	        // to recursively find minimum
	        for (int i = 1; i <= n; i++)
	        {
	            int temp = i * i;
	            if (temp > n)
	                break;
	            else
	                count = Math.min(count, 1 +
	                		minCount(n - temp));
	        }
	        return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(minCount(9));
	}

}
