package Lecture12;

public class checkStringPalindrome {
	public static boolean isPalindrome(String str) {
		//Your code goes here
//		String reveserString="";
//		for(int i=str.length()-1;i>=0;i--) {
//			reveserString+=str.charAt(i);
//		}
//		
//		if(reveserString.equals(str))
//			return true;
//		else {
//			return false;
//		}
		
		
		//below are the another approach
		int i=0;
		int j=str.length()-1;
		while(i<j||i==j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abba";
        boolean check = isPalindrome(str);
        if(check) {
        	System.out.println("palindrome");
        }else {
        	System.out.println("not palindrome");
        }
	}

}
