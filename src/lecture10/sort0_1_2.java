package lecture10;

public class sort0_1_2 {
	public static void sort012(int arr[]) {
		System.out.println("function called");
		int n=arr.length;
		 int low = 0;
		    int high = n - 1;
		    int mid = 0;
		    while(mid<=high) {
		    	if(arr[mid]==0) {
		    		int temp=arr[low];
		    		arr[low]=arr[mid];
		    		arr[mid]=temp;
		    		low++;
		    		mid++;   		
		    	}else if(arr[mid]==1) { 
		    		mid++;
		    	}else {
		    		int temp=arr[mid];
		    		arr[mid]=arr[high];
		    		arr[high]=temp;
		    		high--;
		    	}
		    }
		    for(int i=0;i<n;i++) {
		    	System.out.println(arr[i]);
		    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
       sort012(a);
       
	}

}
