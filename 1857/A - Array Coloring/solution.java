import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        if(sum%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
  }
}