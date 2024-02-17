package Lecture12;

public class reverseString {
    public static String reverseString(String str) {
    	String reverseString="";
    	for(int i=str.length()-1;i>=0;i--) {
          reverseString += str.charAt(i);
    	}
    	
//    	for(int i=0;i<str.length();i++) {
//      reverseString = str.charAt(i)+reverseString;
//	}
    	return reverseString;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="Renu";
          System.out.println(reverseString(str));
	}

}
