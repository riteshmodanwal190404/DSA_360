import java.util.Arrays;
import java.util.Scanner;

public class BusConductor {
    public static int totalStep(int[] chairs, int[] positions){

        int c = chairs.length;
        int p = positions.length;

        Arrays.sort(chairs);
        Arrays.sort(positions);
        int ans =0;

        for (int i = 0; i < chairs.length; i++) {
            ans += Math.abs(chairs[i]-positions[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number of chair = ");
        int c = sc.nextInt();

        int[] chairs = new int[c];

        System.out.println("Enter the chair number = ");
        for (int i = 0; i < chairs.length; i++) {
            chairs[i] = sc.nextInt();
        }

        int[] positions = new int[c];
        System.out.println("Enter the position number = ");

        for (int i = 0; i < positions.length; i++) {
            positions[i] = sc.nextInt();
        }

        int result = totalStep(chairs, positions);

        System.out.println("Total steps by person = " + result);


    }
}
