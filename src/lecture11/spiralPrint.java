package lecture11;

import java.util.Scanner;

public class spiralPrint {
	public static void print2darray(int[][]arr){
		int rows=arr.length;
		      int cols=arr[0].length;
		      for(int i=0;i<rows;i++){
		          for(int j=0;j<cols;j++){
		              System.out.print(arr[i][j]+" ");
		              
		          }
		          System.out.println();
		      }
		}
	public static void spiralPrint(int matrix[][]){
		if(matrix.length==0) {
			return;
		}
		int rowStart=0,rowEnd=matrix.length-1;
		int colStart=0,colEnd=matrix[0].length-1;
		int i=0,j=0,count=0;
		while(count<matrix.length * matrix[0].length-1) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//      print2darray(matrix);
	}

}
