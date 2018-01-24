import java.util.Scanner;

import static java.lang.Math.pow;

public class loops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int v = 1; v <= x; v++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            calc(a, b, c);
        }
    }


    private static int calc(int a, int b, int c) {
        int previous = a;
        for (int w = 0; w < c; w++) {

            previous = previous + (int) ((pow(2, w)) * b);

            System.out.print("" + previous + " ");


        }
        System.out.println("");
        return 0;
    }
}




