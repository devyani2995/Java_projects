//Q.Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
package fundamentals;
import java.util.*;
public class termsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
				int n=1,sum,i=1;
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}
	}

}
