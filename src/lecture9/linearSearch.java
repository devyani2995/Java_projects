package lecture9;

import java.util.Scanner;

public class linearSearch {

	public static int[] takeInput() {
		Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int linearSearch(int arr[],int x) {
		int index =-1;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
		 int arr[]=takeInput();
		 int x=s.nextInt();
		 int index=linearSearch(arr,x);
		 System.out.println(index);
	}
}
