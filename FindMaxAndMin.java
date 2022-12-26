import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int FindMaxAndMin(int[] A, int N) {
        Arrays.sort(A);

        int sum = A[0] + A[N - 1];
        return sum;

    }

    public static void main(String[] args) {
        int[] A = { -2, 1, -4, 5, 3 };
        int N = A.length;
        int sum = FindMaxAndMin(A, N);
        System.out.println(sum);
    }
}