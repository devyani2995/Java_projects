package Test3;

public class minLengthWord {
public static String minLengthWord(String string){
	 System.out.println(string.length());
	String word = "", small = "";
//	String large="";
	if(string.length()==0){
		return small;
	}
    String[] words = new String[100];    
    int length = 0; 
    
    //Add extra space after string to get the last word in the given string    
    string = string + " ";    
    for(int i = 0; i < string.length(); i++){    
        //Split the string into words    
        if(string.charAt(i) != ' '){    
            word = word + string.charAt(i);    
        }    
        else{    
            //Add word to array words    
            words[length] = word;    
            //Increment length    
            length++;    
            //Make word an empty string    
            word = "";    
        }    
    } 
    
    //Initialize small and large with first word in the string    
//    small = large = words[0];   
    small=words[0];
        
    //Determine smallest and largest word in the string    
    for(int k = 0; k < length; k++){    
            
        //If length of small is greater than any word present in the string    
        //Store value of word into small    
        if(small.length() > words[k].length())    
            small = words[k];    
 
        //If length of large is less than any word present in the string    
        //Store value of word into large    
//        if(large.length() < words[k].length())    
//            large = words[k];    
    }   
    
    return small;

}    
	
	public static void main(String[] args) {
		
		String string = "";    
	     System.out.println("Min words"+minLengthWord(string));  
	}

}
