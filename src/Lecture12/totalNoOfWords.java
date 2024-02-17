package Lecture12;

public class totalNoOfWords {
	public static int countWords(String str) {	
		//Your code goes here
//		int count = 1;
//		 
//        for (int i = 0; i < str.length()-1; i++)
//        {
//            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
//            {
//                count++;
//            }
//        }
//        
//        return count;
		
		int c=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="coding is fun for all";
		System.out.println(countWords(str));

	}

}
