import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = 5, c = 5;
        int[][] M = new int[r][c];
        
     
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = sc.nextInt();
            }
        }
 
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (M[i][j] == 1) {
                   
                    int distance = Math.abs(i - 2) + Math.abs(j - 2);
                    System.out.println(distance);
                }
            }
        }
 
        
    }
}