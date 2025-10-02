import java.util.Scanner;

class MoveAllZeroesToEnd {
     static void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        
        int[] temp = new int[n];
        
        int j = 0;
        
        for(int i = 0; i<n; i++ ){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
        
        while(j<n){
            temp[j++] = 0;
        }
        
        for(int i = 0; i < n; i++){
            arr[i]=temp[i];
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array Element = ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        pushZerosToEnd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}