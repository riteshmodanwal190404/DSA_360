import java.util.Scanner;

public class MaximumProductSubarray {
    public static int maxProduct(int[] arr){
        int n = arr.length;
        int maxProd = arr[0];
        int minProd = arr[0];
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i]<0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i], arr[i]*maxProd);
            minProd = Math.min(arr[i], arr[i]*minProd);

            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Element of Array = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxProduct(arr);
        System.out.println("Maximum Product of Subarray = " + result);
    }
}
