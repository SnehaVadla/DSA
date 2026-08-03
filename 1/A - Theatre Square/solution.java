import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        double a=sc.nextInt();
        long res=(long) Math.ceil(n/a)*(long)Math.ceil(m/a);
        System.out.println(res);
    }
}