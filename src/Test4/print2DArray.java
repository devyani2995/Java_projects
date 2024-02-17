package Test4;

public class print2DArray {
	public static void print2DArray(int input[][]) {
		// Write your code here
		int row=input.length;
        int col=input[0].length;
       
        for(int i=0;i<row;i++)
        {     int n=row-i;
                    while(n!=0){
                        
                           
                        
                             for(int j=0;j<col;j++)
                            {
                                 System.out.print(input[i][j]+" ");
                            }
                         n--;
                        System.out.println("");
                    }

           
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(arr);
	}

}
