import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) {
                    neg++;
                }
            }
            int op = 0;
            while (neg > n / 2 || neg % 2 != 0) {
                neg--;
                op++;
            }
            System.out.println(op);
        }
    }
}