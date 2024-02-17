package lecture10;

public class arrayRotaion {
	public static void arrayRotation(int arr[],int d) {
		int n=arr.length;
		// Storing rotated version of array
		int temp[] =new int[n];
		
		// Keeping track of the current index
	    // of temp[]
	    int k = 0;
	 
	    // Storing the n - d elements of
	    // array arr[] to the front of temp[]
	    for (int i = d; i < n; i++) {
	        temp[k] = arr[i];
	        k++;
	    }
	    // Storing the first d elements of array arr[]
	    //  into temp
	    for (int i = 0; i < d; i++) {
	        temp[k] = arr[i];
	        k++;
	    }
	 
	    // Copying the elements of temp[] in arr[]
	    // to get the final rotated array
	    for (int i = 0; i < n; i++) {
	        arr[i] = temp[i];
	    }
	    //print elements of an array
	    for (int i = 0; i < n; i++) {
	       System.out.println(arr[i]);
	    }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,8,6,0,3,9};
       int d=2;
       arrayRotation(a,d);
       
	}
}
