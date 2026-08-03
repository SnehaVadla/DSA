import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int len = Integer.toString(x).length();
            int d = x / (int)Math.pow(10, len-1);
            int sm = (d - 1) * 10;
            int cur = len * (len + 1) / 2;
            int total = sm + cur;
            System.out.println(total);
        }
    }
}