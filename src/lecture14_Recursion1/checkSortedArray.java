package lecture14_Recursion1;

public class checkSortedArray {
    public static boolean checkNumber(int[] arr,int n) {
    	 if(n==0 || n==1) {
    		 return true;
    	 }else if(arr[n-1]< arr[n-2]) {
    		 return false;
    	 }
    	 
    	 return checkNumber(arr,n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 90, 23, 23, 45, 78, 88 };
        int n = arr.length;
        System.out.println(checkNumber(arr,n));
        
	}

}
