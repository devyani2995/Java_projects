package fundamentals;
import java.util.*;
public class reverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original = n;
		int rev =0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(original==rev) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
