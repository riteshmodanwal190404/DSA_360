import java.util.Scanner;

public class BinarySearch {
    public static int searchIndex(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while (low<=high) {
            int mid = (low+high)/2;

            if (arr[mid] == k) {
                ans = mid;
                high = mid-1;
            }
            else if(k>arr[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array's Element = ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Value = ");
        int k = sc.nextInt();

        int result = searchIndex(arr, k);

        System.out.println("Target value First index  = " + result);
    }
}
