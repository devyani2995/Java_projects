package patterns;
import java.util.Scanner; 
public class sumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0;
		while(i<=n) {
			sum+=i;
			int j=1;
			while(j<=i) {
				System.out.print(j);
				if(j<i) {
					System.out.print("+");
				}
				j++;
			}
			
			System.out.println("=" + sum);
			i++;
		}
	}

}
