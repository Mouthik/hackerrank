import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList[] b = new ArrayList[a];
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            b[i]=new ArrayList();
            for (int j = 0; j < c; j++) {
                b[i].add(scanner.nextInt());
            }
        }
        int d = scanner.nextInt();
        int q,w;
        for (int k = 0; k < d; k++) {
            q=scanner.nextInt();
            w=scanner.nextInt();
            try{
                System.out.println(b[q-1].get(w-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
