package Assignment_Recursion;

public class stringToInteger {
	public static int convertStringToInt(String input){
		// Write your code here
		// If the number represented as a string
        // contains only a single digit
        // then returns its value
         if(input.length() == 1) {
        	 return input.charAt(0) - '0';
         }
         
         // Recursive call for the sub-string
         // starting at the second character
         int smallOutput = convertStringToInt(input.substring(1));
         
         // First digit of the number
         double firstDigit = input.charAt(0)-'0';
         
      // First digit multiplied by the
         // appropriate power of 10 and then
         // add the recursive result
         // For example, xy = ((x * 10) + y)
         //     x = x * Math.pow(10, str.length() - 1) + y;
         firstDigit = firstDigit * Math.pow(10, input.length()-1) + smallOutput;
         
         return (int)firstDigit;
         
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="123490";
         System.out.println(convertStringToInt(s));
	}

}
