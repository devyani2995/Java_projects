package patterns;
import java.util.Scanner;
public class oddSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n) {
			int j= i-1;
			while(j<n) {
				System.out.print(2*j+1);
				j++;
			}
			
			int k=0;
			while(k<i-1) {
				System.out.print(2*k+1);
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
