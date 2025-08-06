import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int a,b,sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    
        for(int i = 1; i <= b; i++){
            sum = sum + a;
        }
        System.out.println(sum);
        
    }
}
