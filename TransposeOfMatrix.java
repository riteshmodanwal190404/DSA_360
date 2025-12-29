import java.util.ArrayList;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static ArrayList<ArrayList<Integer>> transpose (int[][] mat){
        int row = mat.length;
        int col = mat[0].length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                newRow.add(mat[j][i]);
            }
            ans.add(newRow);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row = ");
        int row = sc.nextInt();

        System.out.println("Enter the length of col = ");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the Elements of Matrix = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        ArrayList result = transpose(mat);

        System.out.println("Transpose of Matrix = " + result);
    }
}
