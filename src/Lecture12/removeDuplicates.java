package Lecture12;

public class removeDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
	    // Write your code here
		int i = 0;
        int j = 0;
 
    String newElements = "";
 
    while (j < str.length()) {
        if (str.charAt(i) == str.charAt(j)) {
            j++;
        }
        else if (str.charAt(j) != str.charAt(i) || j == str.length() - 1) {
            newElements += str.charAt(i);
            i = j;
            j++;
        }
    }
 
    // Append the last string
    newElements += str.charAt(j-1);
    return newElements;
	}

	public static void main(String[] args) {
	    String str="abbc";
	    String result = removeConsecutiveDuplicates(str);
        System.out.print(result);
	}
}
