package Lecture15_Recursion2;

public class replacePi {
    public static String replacePI(String s) {
    	if(s.length()<=1) {
    		return s;
    	}
    	
    	if(s.charAt(0)== 'p' && s.charAt(1)== 'i') {
    		//call recursion on string of length n-2
    		String smallOutput = replacePI(s.substring(2));
    		return "3.14" + smallOutput;
    	}else {
    		//call recursion on string of length n-1
    		String smallOutput = replacePI(s.substring(1));
    		return s.charAt(0) + smallOutput;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="apiapipipi";
        System.out.println(replacePI(s));
	}

}
