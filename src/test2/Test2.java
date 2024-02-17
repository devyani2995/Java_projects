package test2;

import java.util.Scanner;

public class Test2 {
	public static int max_number(int num){
        
		int max = 0;
        for (int i = 1; i < num; i *= 10) {
            max = Math.max(max, num % i + num / (i * 10) * i);
            
        }
        return max;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
	      System.out.println(max_number(n));
}
}
