/*
 * Q. Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
 * */

package lecture14_Recursion1;

public class printNNaturalNo {
	public static void print(int n){
		//Write your code here
		if(n > 0)
        {
			print(n - 1);
            System.out.print(n + " ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int N=7;
          print(N);
	}

}
