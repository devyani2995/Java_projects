package Lecture15_Recursion2;

public class removeDuplicate {
	public static String removeConsecutiveDuplicates(String s) {
		 if(s.length() <= 1) {
			 return s;
		 }
		 String smallOutput = removeConsecutiveDuplicates(s.substring(1));
		 if(s.charAt(0) == s.charAt(1)) {
		
			 return smallOutput;
		 }else {
			 return  s.charAt(0) + smallOutput;
		 }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="xxxyyyzwwzzz";
          System.out.println(removeConsecutiveDuplicates(s));
	}

}
