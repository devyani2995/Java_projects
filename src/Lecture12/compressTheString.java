package Lecture12;

public class compressTheString {
    public static String compressString(String str) {
    	 // Write your code here
//		int i = 0;
//        int j = 0;
//       int c=0;
//    String newElements = "";
// 
//    while (j < str.length()) {
//        if (str.charAt(i) == str.charAt(j)) {
//            j++;
//            c++;
//        }
//        else if (str.charAt(j) != str.charAt(i) || j == str.length() - 1) {
//        	if(c==1)
//            newElements += str.charAt(i);
//        	else {
//        		newElements += str.charAt(i)+c;
//        	}
//            i = j;
//            j++;
//            c=1;
//        }
//    }
// 
//    // Append the last string
//    if(c==1)
//    newElements += str.charAt(j-1);
//    else {
//    	 newElements += str.charAt(j-1)+c;
//    }
//    return newElements;
    	
    	int i,c = 1,j = 0;
    	   String result = "";
    	   for(i = 0;i < str.length() - 1;i++) {
    		   if(str.charAt(i+1) == str.charAt(i)) {
    			   c++;	   
    		   }
    		   else {
    			   if(c != 1)
    			   result = result + str.charAt(i) + c;
    			   else
    			   result = result + str.charAt(i);
    	           c = 1;
    		   }
    	   }
    	   if(c != 1)
    	   result = result + str.charAt(i) + c;
    	   else
    	   result = result + str.charAt(i);   
    	   return result;
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="aaabbccdsa";         
          System.out.println(compressString(s));
          
	}

}
