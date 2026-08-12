import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            boolean b = true;
            long md = Long.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    b = false;
                    break;
                }
                md = Math.min(md, a[i + 1] - a[i]);
            }
            if (!b) {
                System.out.println(0);
            } else {
                System.out.println(md / 2 + 1);
            }
        }
    }
}