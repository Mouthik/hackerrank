import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int[][] arr1 = new int[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0) count++;
            arr1[i][i] = arr[i];
            for (int j = 0; j < i; j++) {
                arr1[j][i] = arr1[j][i - 1] + arr[i];
                if (arr1[j][i] < 0) count++;
            }
        }
        System.out.println(count);
    }
}

