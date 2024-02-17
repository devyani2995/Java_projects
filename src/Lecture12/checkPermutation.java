package Lecture12;
import java.util.*;
public class checkPermutation {
	public static String sortStrings(String str) {
		 // Converting string into an array for computation
       char arr[] = str.toCharArray();

       // Nested loops for comparison of characters
       // in above character array
      
       Arrays.sort(arr);
      //The method valueOf() will convert the entire array into a string.
       String sortArray = String.valueOf(arr);
       return sortArray;
		
		
	}
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		boolean result = true;;
		if(str1.length() != str2.length())
		  result = false;
		else {
			String s1 = sortStrings(str1);
			String s2 = sortStrings(str2);
			
			for(int i = 0;i < s1.length();i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					result = false;
					break;
				}
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1= "abcd";
         String str2="efgh";
         System.out.println(isPermutation(str1,str2));
	}

}
