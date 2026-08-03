import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while(t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long cycleSum = a + b + c;       
            long fullCycles = n / cycleSum;  
            long distanceCovered = fullCycles * cycleSum;
            long remaining = n - distanceCovered;
            
            if(remaining == 0) {
                System.out.println(fullCycles * 3);
                continue;
            }
            
            long day = fullCycles * 3;
            long[] days = {a, b, c};
            for(long d : days) {
                day++;
                remaining -= d;
                if(remaining <= 0) {
                    System.out.println(day);
                    break;
                }
            }
        }
    }
}