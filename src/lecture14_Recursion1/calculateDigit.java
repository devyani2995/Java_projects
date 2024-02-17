package lecture14_Recursion1;

public class calculateDigit {
	public static int count=0;
    public static int calDigits(int n) {
    	 if(n>0) {
    		 count++;
    		 calDigits(n/10);
    	 }
    	 return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=12345;
       System.out.println(calDigits(n));
	}

}
