package lecture10;

public class bubbleSort {
	public static void bubbleSorting(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			 for(int j=0;j<n-1-i;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,8,6,0,3,9};
       bubbleSorting(a);
       
	}
}
