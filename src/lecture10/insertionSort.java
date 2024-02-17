package lecture10;

public class insertionSort {
	public static void insertionSorting(int arr[]) {
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
			 //insert ith element in sorted portion
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j] >temp) {
				arr[j+1]=arr[j];
				j--;
			}
			//position will be j+1
			arr[j+1] =temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,8,6,0,3,9};
       insertionSorting(a);
       
	}
}
