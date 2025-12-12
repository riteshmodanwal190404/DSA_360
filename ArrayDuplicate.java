import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDuplicate {
    public static ArrayList<Integer> arrayDuplicate1(int[] arr){
        int n = arr.length;

        int[] freq =new int[n+1];

        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            freq[num]++;
        }

        for(int i = 1; i<= n; i++){
            if(freq[i] ==2){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array's Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = arrayDuplicate1(arr);

        System.out.println("Twice Element in Array = " + result);

    }
}
