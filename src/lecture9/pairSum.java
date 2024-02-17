package lecture9;

public class pairSum {

	public static int pairSum(int arr[],int x) {
    	int n = arr.length;
    	int c=0;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if((arr[i]+arr[j])==x) {
    				c++;
    			}
    		}
    	}
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 3 6 2 5 4 3 2 4
         int arr[]= {1,3,6,2,5,4,3,2,4};
         int x = 7;
         System.out.println(pairSum(arr,x));
	}

}
