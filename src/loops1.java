import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int x = N * i;
            System.out.println(N + " x " + i + " = " + x);
        }
    }
}
