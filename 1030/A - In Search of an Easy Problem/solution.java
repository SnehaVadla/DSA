import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[] a = new int[n];
 
        boolean b = true;  
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                b = false;
            }
        }
 
        System.out.println(b ? "EASY" : "HARD");
    }
}