import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
 
            long q = (n - y) / x;     
            long k = q * x + y;        
            System.out.println(k);
        }
    }
}