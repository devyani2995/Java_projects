package lecture14_Recursion1;

public class lastIndex {
	public static int lastIndex(int input[], int x,int n) {
	    if(n<0)
	    	return -1;
	    else if(input[n]==x) {
	    	return n;
	    }
	    return lastIndex(input,x,n-1);
	
	}
	public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,input.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,10,8};
	       int x=8;
	       System.out.println(lastIndex(arr,x));
	}

}
