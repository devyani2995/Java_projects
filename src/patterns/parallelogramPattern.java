package patterns;
import java.util.Scanner;
public class parallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
        while(i<=n) {
        	int space = i-1;
        	while(space>=1) {
        		System.out.print(" ");
        		space--;
        	}
        	
        	int stars =1;
        	while(stars<=n) {
        		System.out.print("*");
        		stars++;
        	}
        	System.out.println(" ");
        	i++;
             
        }
	}	

}
