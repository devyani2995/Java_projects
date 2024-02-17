package Assignment_Recursion;

public class checkPalindrome {
	public static boolean isPalindrome(String str,int start, int end) {
		 // If there is only one character
        if (start == end)
            return true;
 
        // If first and last
        // characters do not match
        if ((str.charAt(start)) != (str.charAt(end)))
            return false;
        
     // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (start < end + 1)
            return isPalindrome(str, start + 1, end - 1);
 
        return true;
	}
	public static boolean isPalindrome(String str) {
       int l=str.length();
       
       if(l==0) {
    	   return true;
       }
       return isPalindrome(str, 0, l - 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="hjigk";
         System.out.println(isPalindrome(s));
         
	}

}
