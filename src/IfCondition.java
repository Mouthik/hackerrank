import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String ans = "";
        if (a % 2 == 1 || a % 2 == 0 && a >= 6 && a <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}

