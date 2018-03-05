import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bigdecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a == null || b == null) {
                    return 0;
                }
                BigDecimal a1 = new BigDecimal(a);
                BigDecimal b1 = new BigDecimal(b);
                return b1.compareTo(a1);
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
