package lecture11;

public class rowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		//Your code goes 
		int row=mat.length;
		int col=mat[0].length;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{2,2,2},{2,3,4}};
        rowWiseSum(arr);
	}

}
