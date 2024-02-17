package lecture13;
import java.util.*;
public class duplicateElement {
	public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int duplicate = -1;
        for(int i = 0; i  <arr. length; i ++) {
            // Compare adjacent elements.
            if(arr[i] == arr[i+1]) {
                duplicate = arr[i];
                break;
            }
        }
        return duplicate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 7 2 5 4 7 1 3 6
       int arr[]= {0,7,5,4,7,1,3,6};
       System.out.println(findDuplicate(arr));
	}

}
