import java.util.Scanner;

public class endofFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = 0;
        while (sc.hasNext()) {
            i++;
            System.out.println(i + " " + sc.nextLine());
        }


    }
}
