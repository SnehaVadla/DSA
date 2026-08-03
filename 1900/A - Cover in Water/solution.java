import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int dots = 0;
            int maxLen = 0;
            int curr = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '.') {
                    dots++;
                    curr++;
                    maxLen = Math.max(maxLen, curr);
                } else {
                    curr = 0;
                }
            }
            if (maxLen >= 3) {
                System.out.println(2);
            } else {
                System.out.println(dots);
            }
        }
    }
}