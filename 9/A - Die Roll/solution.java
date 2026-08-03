import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
 
        int max = Math.max(Y, W);
        int f = 6 - max + 1;
        int d = 6;
 
        int gcd = gcd(f, d);
 
        System.out.println((f / gcd) + "/" + (d / gcd));
    }
 
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}