import java.util.Scanner;

public class Stdin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=0;

            if (x > c && y > c) {
                int z = x * y;
                System.out.println(z);
            }


            else  {

                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }



    }
}
