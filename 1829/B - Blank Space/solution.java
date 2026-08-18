import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cur = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    cur++;
                    ans = Math.max(ans, cur);
                } else {
                    cur = 0;
                }
            }
            System.out.println(ans);
        }
    }
}