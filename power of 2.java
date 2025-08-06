import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int num = sc.nextInt();

        
        if (isPowerOfTwo(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    
    public static boolean isPowerOfTwo(int n) {
        
        return n > 0 && (n & (n - 1)) == 0;

        
    }
}
