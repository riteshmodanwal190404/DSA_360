import java.util.Scanner;

public class EvenOdd {
    public static boolean isPrime(int n){
        if (n%2==0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for Check Even or Odd = ");
        int n = sc.nextInt();

        if (isPrime(n) == true) {
            System.out.println(n +" is an Even Number.");
        }
        else{
            System.out.println(n + " is an Odd Number.");
        }
    }
}
