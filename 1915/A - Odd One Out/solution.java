import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for (int T = 0; T < t; T++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            if (a == b) {
                System.out.println(c);
            } else if (b == c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
       
    }
}