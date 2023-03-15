import java.util.*; // contains Collections framework

public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println(".............");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}