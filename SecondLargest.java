import java.util.Scanner;

public class SecondLargest {
    static int getSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
                
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]>secondMax && arr[i]!=max ) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array's Elements = ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int second = getSecondLargest(arr);



        System.out.print("Second Largest element is = " + second );

    }
}
