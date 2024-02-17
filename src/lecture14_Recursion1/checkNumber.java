package lecture14_Recursion1;

public class checkNumber {
    public static boolean checkNumber(int input[], int x,int startIndex) {
		  if(startIndex == input.length) {
			  return false;
		  }else if(input[startIndex] == x) {
			  return true;
		  }
		  
		  return checkNumber(input,x,startIndex+1);
			  
	}
	public static boolean checkNumber(int input[], int x) {
		  return checkNumber(input,x,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {9,8,0};
          int x=0;
          System.out.println(checkNumber(arr,x));
	}

}
