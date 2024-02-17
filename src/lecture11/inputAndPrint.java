package lecture11;
import java.util.*;
public class inputAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int row=s.nextInt();
		System.out.println("enterv columns");
		int col=s.nextInt();
		
		int arr[][]=new int[row][col];//2D array declaration
		
		System.out.println("enter 2d array elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
				
			}
		}
		System.out.println("printing 2d elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
