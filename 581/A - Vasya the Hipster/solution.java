import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt();  
 
        int f = Math.min(a, b);
        a -= f;
        b -= f;
 
        int s = (a + b) / 2;
 
        System.out.println(f + " " + s);
    }
}