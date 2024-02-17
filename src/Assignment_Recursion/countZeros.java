package Assignment_Recursion;

public class countZeros {
	public static int countZerosRec(int input){
		// Write your code here
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=00010204;
          System.out.println(countZerosRec(n));
	}

}
