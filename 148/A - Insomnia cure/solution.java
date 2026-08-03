import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        if (k == 1 || l == 1 || m == 1 || n == 1) {
            System.out.println(d);
            return;
        }
 
        boolean[] damaged = new boolean[d + 1];
 
        for (int i = k; i <= d; i += k) damaged[i] = true;
        for (int i = l; i <= d; i += l) damaged[i] = true;
        for (int i = m; i <= d; i += m) damaged[i] = true;
        for (int i = n; i <= d; i += n) damaged[i] = true;
 
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (damaged[i]) count++;
        }
 
        System.out.println(count);
    }
}