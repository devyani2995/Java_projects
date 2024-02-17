package Lecture12;

public class sortStrings {
	public static String sortStrings(String str) {
		 // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
       //The method valueOf() will convert the entire array into a string.
        String sortArray = String.valueOf(arr);
        return sortArray;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="geeksforgeeks";
         
         System.out.println(sortStrings(str));
	}
}
