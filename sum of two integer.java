import java.util.*;
public class Solution{
static int solveMeFirst(int a, int b){
  return a + b;
}
public static void main(String[] args){
  int a,b,sum=0;
  Scanner sc = new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  sum = solveMeFirst(a,b);
  System.out.println(sum);
}
}


