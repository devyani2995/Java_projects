package lecture10;

public class mergeTwoSortedArrays {
	public static void mergeSortedArrays(int arr1[],int arr2[]) {
		 int n1=arr1.length;
		 int n2=arr2.length;
		 int merge[] = new int[n1+n2];
		 int i=0,j=0,k=0;
		 while(i<n1&&j<n2) {
			 if(arr1[i]<arr2[j]) {
				 merge[k]=arr1[i];
				 i++;
				 k++;
			 }else {
				 merge[k]=arr2[j];
				 j++;
                 k++;				 
			 }
		 }
		 while(i<n1) {
			 merge[k]=arr1[i];
			 k++;
			 i++;
		 }
		 while(j<n2) {
			 merge[k]=arr2[j];
			 k++;
			 j++;
		 }
		 
		 for(int x=0;x<n1+n2;x++) {
			 System.out.println(merge[x]);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a1[]= {1,2,4,8};
       int a2[]= {0,5,6,9,10};
       mergeSortedArrays(a1,a2);
       
	}
}
