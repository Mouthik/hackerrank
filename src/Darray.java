import java.util.Scanner;

public class Darray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r[] = new int[a];
        for (int i = 0; i < a; i++) {
            r[i] = scanner.nextInt();

        }
        for (int i = 0; i < a; i++) {
            System.out.println(r[i]);
        }
    }
}
