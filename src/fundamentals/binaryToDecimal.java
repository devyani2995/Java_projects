package fundamentals;
import java.util.*;
public class binaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=0,r;
		int d=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			d=(int)(d+r*Math.pow(2, i));
			i++;
		}
		System.out.println(d);
	}

}
