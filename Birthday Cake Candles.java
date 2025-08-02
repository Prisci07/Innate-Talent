import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Result {

    
    public static int birthdayCakeCandles(List<Integer> candles) {
    
        int tallest = candles.get(0);
        int count = 1;

        for (int i = 1; i < candles.size(); i++) {
            int height = candles.get(i);
            if (height > tallest) {
                tallest = height;
                count = 1;
            } else if (height == tallest) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 

        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candles.add(scanner.nextInt());
        }

        int result = Result.birthdayCakeCandles(candles);
        System.out.println(result);

        scanner.close();
    }
}
