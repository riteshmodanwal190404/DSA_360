import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInGroup {
    public static void reverseArray(int[] nums, int k){
        int n = nums.length;

        for (int i = 0; i < n; i+=k) {
            int left = i; 
            int right = Math.min(i+k-1, n-1);

            while (left<right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

        }
        System.out.println("Reverse Array = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n =  sc.nextInt();

        System.out.println("Enter the Value of Key = ");
        int k = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Element of Array's = ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        reverseArray(nums, k);

    }
}
