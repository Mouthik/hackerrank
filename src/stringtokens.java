import java.util.Scanner;

public class stringtokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.trim().length() >= 1) {
            String delims = "[_\\@ !,?.']+";
            String[] items = a.trim().split(delims);
            System.out.println(items.length);
            for (String item : items) {

                System.out.println(item);
            }
        } else {
            System.out.println("0");

        }
    }
}

