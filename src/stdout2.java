import java.util.Scanner;

public class stdout2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double a2 = scanner.nextDouble();
        scanner.nextLine();
        String a3 = scanner.nextLine();
        System.out.println("String: " + a3);
        System.out.println("Double: " + a2);
        System.out.println("Int: " + a);
    }

}
