package Assignment_Recursion;

public class checkAB {
  public static boolean check(String s){
		
		if(s.length()==0)
			return true;
		boolean isAB=false;
		if(s.charAt(0)=='a'){
			if(s.length()==1){
				return true;
			}else if(s.charAt(1)=='a'){
				isAB=check(s.substring(1));
			}else if(s.length()>=3 && s.substring(1, 3).equals("bb")){
				isAB=check(s.substring(2));
			}else{
				return false;
			}
		
		}else if(s.charAt(0)=='b'){
			if(s.length()==1){
				return true;
			}else if(s.charAt(1)=='a'){
				isAB=check(s.substring(1));
			}else{
				return false;
			}
		}
		
		return isAB;
}
	public static boolean checkAB(String input) {
		// Write your code here
		boolean isAB=true;
		if(input.charAt(0)!='a'){
			isAB=false;
		}else{
			isAB=check(input);
		}
		
		return isAB;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbabb";
		System.out.println(checkAB(str));
		
	}

}
