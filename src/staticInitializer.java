import java.util.Scanner;

public class staticInitializer {
    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } else {
                int area = B * H;
                System.out.println("Area of a Parallelogram :" + area);


            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

    }
}
