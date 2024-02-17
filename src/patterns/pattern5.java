package patterns;
import java.util.Scanner;
public class pattern5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		 for(i=1;i<=n;i++) {
			 for(j=n;j>=1;j--) {
				 if(j!=i) {
					 System.out.print(j);
				 }else {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
	}

}
