package Lecture12;

public class maxOccuringCharacter {
	static char MaxOccuringChar(String str1) {
		  int ctr[] = new int[256];
		  int l = str1.length();
		  for (int i = 0; i < l; i++) {
		   ctr[str1.charAt(i)]++;
		  
		  }
		  
		  for (int i = 0; i < l; i++) {
			   System.out.println(ctr[i]);
			  
			  }
		  int max = -1;
		  char result = ' ';

		  for (int i = 0; i < l; i++) {
		   if (max < ctr[str1.charAt(i)]) {
		    max = ctr[str1.charAt(i)];
		    result = str1.charAt(i);
		   }
		  }

		  return result;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "abdefgbabfba";
		  System.out.println("The given string is: " + str1);
		  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
	}

}
