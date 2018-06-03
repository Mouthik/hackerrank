import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        System.out.println(n.isProbablePrime(2) ? "prime" : "not prime");

    }
}
