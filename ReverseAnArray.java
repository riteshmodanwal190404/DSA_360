import java.util.Scanner;

public class ReverseAnArray {
    static void reverseArray(int[] arr){
        int n = arr.length;

        int [] temp = new int[n];


        for(int i =0; i<n; i++){
            temp[i] = arr[n - 1 -i]; 
        }

        for(int i = 0; i<n; i++){
            arr[i] = temp[i];
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array size =  ");
        int n = sc.nextInt();

        System.out.println("Enter the Array's Elements = ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reverse Arrays = ");

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        } 
    }
}
