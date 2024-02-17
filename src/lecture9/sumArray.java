package lecture9;

import java.util.Scanner;

public class sumArray {
	public static int[] takeInput() {
		Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int sum(int[] arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int testCase=s.nextInt();
		for(int i=1;i<=testCase;i++) {
       int arr[]=takeInput();
       System.out.println(sum(arr));
	}
	}

}
