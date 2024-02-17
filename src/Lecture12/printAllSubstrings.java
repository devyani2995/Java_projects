package Lecture12;

public class printAllSubstrings {
	public static void printSubstrings(String str) {
		//Your code goes here
		int start=0,end=0;
		String substr="";
		for(start=0;start<str.length();start++) {
			for(end=start;end<str.length();end++) {
			System.out.println(str.substring(start,end+1));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="pqrs";
         printSubstrings(str);
	}

}
