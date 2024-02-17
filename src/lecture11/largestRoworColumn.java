package lecture11;

public class largestRoworColumn {
	public static void findLargest(int[][] mat) {
		//Your code goes 
		int largestRow =Integer.MIN_VALUE;
		int largestCol =Integer.MIN_VALUE;
		int rowIndex=0,colIndex=0;
		for(int i=0;i<mat.length;i++) {
			int sum=0;
			for(int j=0;j<mat[i].length;j++) {
				sum=sum+mat[i][j];
			}
			if(sum>largestRow) {
				largestRow=sum; 
				rowIndex=i;
			}
		}
		if(mat.length!=0){
		for(int j=0;j<mat[0].length;j++) {
			int sum=0;
			for(int i=0;i<mat.length;i++) {
				sum=sum+mat[i][j];
			}
			if(sum>largestCol) {
				largestCol=sum;
				colIndex=j;
			}
			
		}
		}
		
		 if(largestRow>largestCol) {
			 System.out.println("row"+" "+rowIndex+" "+largestRow);
		 }else if(largestRow<largestCol) {
			 System.out.println("column"+" "+colIndex+" "+largestCol);
		 }else if(largestRow==largestCol){
			 System.out.println("row"+" "+rowIndex+" "+largestRow);
		 }else{
			 System.out.println("row 0 -2147483648");
		 }
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{6,9},{8,5},{9,2}};
//        int sum=largestColSum(arr);
//        System.out.println(sum);
        findLargest(arr);
}
}
