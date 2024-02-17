package Lecture12;

public class reverseStringWordWise {
	public static String reverseWordWise(String str) {
		// Write your code here
		String reverseString="";
    	for(int i=str.length()-1;i>=0;i--) {
          reverseString += str.charAt(i);
    	}
    	
    	String ans="";
    	int currentWordStart =0;
    	int i=0;
		for(;i<reverseString.length();i++) {
			if(reverseString.charAt(i)==' ') {
				//reverse current word
				int currentWordEnd=i-1;	
				String reverseWord ="";
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reverseWord=reverseString.charAt(j)+reverseWord;
				}
				//add it in final string(ans)
				ans+=reverseWord + " ";
				currentWordStart = i+1;
			}
		}
		//only for last word we've to repeat the same bcz there is no space after last word
		int currentWordEnd=i-1;	
		String reverseWord ="";
		for(int j=currentWordStart;j<=currentWordEnd;j++) {
			reverseWord=reverseString.charAt(j)+reverseWord;
		}
		//add it in final string(ans)
		ans+=reverseWord + " ";
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Renu is good";
        System.out.print(reverseWordWise(str));
	}

}
