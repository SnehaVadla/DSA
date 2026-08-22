import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long dy = d - b;
            if (dy < 0) {
                System.out.println(-1);
                continue;
            }
            if (a + dy < c) {
                System.out.println(-1);
                continue;
            }
 
            long ans = dy + (a + dy - c);
            System.out.println(ans);
        }
    }
}