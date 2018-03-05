import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a > 0) {
            String name = scanner.nextLine();

            if (name.matches(new MyRege().pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
        a--;
    }
}

