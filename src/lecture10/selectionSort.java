package lecture10;

public class selectionSort {
	public static void selectionSorting(int a[]) {
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<n;j++) {
				//finding minimum element at jth position
				if(a[j]<min) {
					min=a[j];
					minIndex = j;
				}
			}
			//swap element at minIndex with ith element
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,8,6,0,3,9};
       selectionSorting(a);
       
	}

}
