package lecture14_Recursion1;

public class sumOfArray {
	public static int sum(int input[],int startIndex) {
		if (startIndex==input.length) {
			return 0;
		}		

		// int sumN = sum(input,startIndex+1);
		// int ans = input[startIndex] + sumN;
		// return ans;

		return input[startIndex] + sum(input,startIndex+1);
	}
	
	public static int sum(int[] input) {
		return sum(input,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {4,2,1};
        System.out.println(sum(a));
        
	}

}
