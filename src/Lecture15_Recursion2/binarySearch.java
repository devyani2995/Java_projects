package Lecture15_Recursion2;

public class binarySearch {
    public static int binarySearch(int[] arr,int si,int ei,int num) {
    	
    	
    	if((arr.length == 0) || (si > ei))
    		return -1;
      
    	int midIndex = (si+si)/2;
       
    	if(arr[midIndex] == num) {
    		return midIndex;
    	}else if(arr[midIndex] < num) {
    		 return binarySearch(arr,midIndex + 1,ei,num);
    	}else {
    		return binarySearch(arr,si,midIndex-1,num);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,3,5,7,9,10,13};
         int n=100;
         System.out.println(binarySearch(arr,0,arr.length-1,n));
	}

}
