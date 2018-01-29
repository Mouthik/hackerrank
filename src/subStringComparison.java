import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class subStringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int x = scanner.nextInt();
        SortedSet<String> sets = new TreeSet<String>();
        for (int i = 0; i <= string.length() - x; i++) {
            sets.add(string.substring(i, i + x));
        }
        String small = sets.first();
        String large = sets.last();
        System.out.println(small);
        System.out.println(large);
    }

}

