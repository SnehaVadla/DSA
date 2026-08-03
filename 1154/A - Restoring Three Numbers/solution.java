import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
 
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
 
        Arrays.sort(nums);  
        int a = nums[3] - nums[2];
        int b = nums[3] - nums[1];
        int c = nums[3] - nums[0];
 
        System.out.println(a + " " + b + " " + c);
        sc.close();
    }
}