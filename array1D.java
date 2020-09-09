import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int integers;
        int[] a = new int[n];
        for(int i=0; i<a.length;i++){
            integers = scan.nextInt();
            a[i] = integers;
        }
    }
}


