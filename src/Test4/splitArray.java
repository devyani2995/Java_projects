package Test4;

public class splitArray {
	public static boolean splitArray(int arr[], int startIndex, int lsum, int rsum){ 
         //lsum for sum of numbers divisible by 5 and rsum for sum of numbers divisible by 3
  
    	if (startIndex == arr.length) 
        {
            return lsum == rsum;
        }
         
    	if (arr[startIndex] % 5 == 0)
        {
            lsum += arr[startIndex];
        }
        else if (arr[startIndex] % 3 == 0) 
        {
            rsum += arr[startIndex]; 
        }
        else
        {
            return splitArray(arr,startIndex+1, lsum+arr[startIndex], rsum)  || splitArray(arr,startIndex+1,lsum,rsum+arr[startIndex]);
        }
         
    	return splitArray(arr,startIndex+1,lsum,rsum); 
	} 
	public static boolean splitArray(int input[]) {
		 int n=input.length;
		 return splitArray(input,0,0,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {2,6,4};
         System.out.println(splitArray(arr));
	}

}
