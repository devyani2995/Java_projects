/*
 *Q. Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
 */
package CourseTest1;

public class rectangularPattern {
	public static void print(int n) {
		//Write your code here
		int i,j,k;
		for (i=n;i>=1;i--) {
			for (j=n;j>=i;j--)
				System.out.print(j);
			
			for (j=1;j<(i*2)-1;j++)
				System.out.print(i);
			
			for (j=i+1;j<=n;j++)
				System.out.print(j);
			
			System.out.println();
		}
		for (i=2;i<=n;i++) {
			for (j=n;j>=i;j--)
				System.out.print(j);
			
			for (j=1;j<(i*2)-1;j++)
				System.out.print(i);
			
			for (j=i+1;j<=n;j++)
				System.out.print(j);
			
			System.out.println();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N=4;
        print(N);
	}
}
