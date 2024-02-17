package lecture11;

public class largestColSum {
	public static int largestColSum(int[][] arr) {
		//Your code goes 
		int row=arr.length;
		int col=arr[0].length;
		
		
		int largestCol =Integer.MIN_VALUE;
		
		for(int j=0;j<col;j++) {
			int sum=0;
			for(int i=0;i<row;i++) {
				sum=sum+arr[i][j];
			}
			if(sum>largestCol) {
				largestCol=sum;
			}
			
		}
		return largestCol;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{6,9},{8,5},{9,2}};
        int sum=largestColSum(arr);
        System.out.println(sum);
	}
}
