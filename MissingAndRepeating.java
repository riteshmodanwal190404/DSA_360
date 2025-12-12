import java.util.ArrayList;
import java.util.Scanner;

public class MissingAndRepeating {
    public static ArrayList<Integer> twoValue(int[] arr){
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        int[] freq = new int[n+1];

        for (int num : arr) {
            freq[num]++;

        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                ans.add(i);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Element of Array = ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = twoValue(arr);

        System.out.println("Duplicate And Missing Number = " + result);
    }
}
