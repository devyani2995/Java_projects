package fundamentals;
import java.util.*;
import java.util.Scanner;

public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num,i,sqrt=1;
        num=sc.nextInt();
        
        
        for(i=0;i<=num;i++)
        {
            
            if((i*i)>num)
            {sqrt=i-1;
             break;
            }
        }
        
        System.out.println(sqrt);
	}

}
