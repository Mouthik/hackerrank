import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.equals(new StringBuilder(input).reverse().toString()) ? "Yes" : "No");
    }
}
