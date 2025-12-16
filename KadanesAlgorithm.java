import java.util.Scanner;

public class KadanesAlgorithm {
    public static int kadaneAlgo(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum += arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sixe of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array's Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = kadaneAlgo(arr);

        System.out.println("Maximum sum of Subarray = " + result);
    }
}
