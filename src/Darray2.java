import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Darray2 {
    public static void main(String[] args) {
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1) {
                        int sum =
                                a[i][j]
                                        + a[i][j - 1]
                                        + a[i][j - 2]
                                        + a[i - 1][j - 1]
                                        + a[i - 2][j]
                                        + a[i - 2][j - 1]
                                        + a[i - 2][j - 2];
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}







        /*   int[][] d = {{1, 5, 74, 2}, {4, 68, 45, 65}, {5, 0, 34, 54}};
      for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(d[i][j]);
            }

        }*/
        /*for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j <= 3; j++) {
                sum = sum + d[i][j];
            }
            System.out.println(sum);
        }

        for (int i = 0; i<=d.length; i++) {
         int sum=0;
            for (int j = 0; j <d.length; j++) {
                sum=sum+d[j][i];
            }
            System.out.println(sum);
        }


        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum = sum + d[i][i];
        }
        System.out.println(sum);

        int j= d.length,sum=0;
        for (int i = 0; i < d.length; i++) {

            sum = sum + d[i][j];
            j--;
        }
        System.out.println(sum);

 */







