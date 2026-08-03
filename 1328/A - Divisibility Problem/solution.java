import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            long rem = a % b;
            long m = rem == 0 ? 0 : b - rem;
 
            System.out.println(m);
        }
 
        sc.close();
    }
}