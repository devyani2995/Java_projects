package lecture14_Recursion1;

public class firstIndexOfaNumber {
	public static int firstIndex(int input[], int x,int startIndex) {
		 if(startIndex == input.length) {
			  return -1;
		  }else if(input[startIndex] == x) {
			  return startIndex;
		  }
		 
		 return firstIndex(input,x,startIndex+1);
	}
	public static int firstIndex(int input[], int x) {
		return firstIndex(input,x,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {9,8,10,8};
       int x=8;
       System.out.println(firstIndex(arr,x));
	}

}
