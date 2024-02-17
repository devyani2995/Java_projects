package lecture10;

public class binarySearch {
    public static int binarySearch(int arr[],int x) {
    	 int startIndex=0;
    	 int endIndex=arr.length-1;
    	 int mid;
    	 while(startIndex<=endIndex) {
    		 mid=(startIndex+endIndex)/2;
    		 if(arr[mid]>x) {
    			 endIndex = mid-1;
    		 }else if(arr[mid]<x) {
    			 startIndex=mid+1;
    		 }else {
    			 return mid;
    		 }
    	 }
    	 return -1;
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,6,5};
		int x=7;
		System.out.println(binarySearch(arr,x));
	}

}
