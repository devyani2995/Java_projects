package lecture11;
import java.util.*;
public class array2DWithFunction {
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
		public static int[][] takeInput(){
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter the number of rows and cols");
		    int rows=s.nextInt();
		    int cols=s.nextInt();
		    
		    int[][] arr=new int[rows][cols];
		    System.out.println("enter elements");
		    for(int i=0;i<rows;i++){
		        for(int j=0;j<cols;j++){
		       
		            arr[i][j]=s.nextInt();
		        }
		    }
		    return arr;
		}
		      
		    
		    public static void main(String args[]) {
		      int[][]input=takeInput();
		      print2darray(input);
		    }
		    }
