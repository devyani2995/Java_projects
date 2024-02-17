/*
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
 * */
package Lecture12;

public class removeCharcter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String result = "";
		for(int i= 0;i < str.length();i++) {
			if(str.charAt(i) == ch)
				continue;
			result += str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="xxyyzxx";
        char ch='y';
        System.out.println(removeAllOccurrencesOfChar(str,ch));
        
	}

}
