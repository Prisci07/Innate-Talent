import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Result {

    

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
            
        }

        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }

        
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }

        
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
