import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        
    }
}
