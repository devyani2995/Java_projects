package Lecture15_Recursion2;
import java.util.*;
public class towerOfHanoi {
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
		if(disks == 0){
			return;
		}
		if(disks==1){
            System.out.println(source + " " + destination);
            return;
        }
		towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println(source +" " + destination);
        towerOfHanoi(disks-1,auxiliary,source,destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
	}

}
