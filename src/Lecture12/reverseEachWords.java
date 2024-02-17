package Lecture12;

public class reverseEachWords {
    public static String reverseEachWords(String str) {
    	String ans="";
    	int currentWordStart =0;
    	int i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				//reverse current word
				int currentWordEnd=i-1;	
				String reverseWord ="";
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reverseWord=str.charAt(j)+reverseWord;
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
			reverseWord=str.charAt(j)+reverseWord;
		}
		//add it in final string(ans)
		ans+=reverseWord + " ";
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Coding is fun for all";       
        System.out.print(reverseEachWords(str));
	}

}
