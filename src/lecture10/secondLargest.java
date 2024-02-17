package lecture10;
//We can find the second largest number in an array in java by sorting the array and returning the 2nd largest number.
public class secondLargest {
	public static int findSecLargest(int arr[]) {
		int n=arr.length;
		int temp;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[n-2];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,4,8,6,0,3,9};
       System.out.println(findSecLargest(a));
       
	}
}
