package Lecture15_Recursion2;

public class removeX {
	public static String removeX(String input){
		// Write your code here
		if (input.length() == 0)
	    {
	        return "";
	    }
		
		// Check the first character
	    // of the given string
		   String smallOutput = removeX(input.substring(1));
	    if (input.charAt(0) == 'x')
	    {
	 
	        // Pass the rest of the string
	        // to recursion Function call
	        return smallOutput;
	    }else {
	    	return input.charAt(0)+ smallOutput;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="xx";
         System.out.println(removeX(str));
	}

}
