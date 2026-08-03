import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            
            if( a+b==10 || a+b>10){
                System.out.println("YES");
            }
            else if( b+c==10 || b+c>10){
                System.out.println("YES");
            }
            else if( a+c==10 || a+c>10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    
    }
 }
}