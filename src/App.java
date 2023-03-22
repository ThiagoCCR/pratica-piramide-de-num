import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número- ");
        int number = scan.nextInt();
        System.out.println("Piramide do número " + number);
        for (int i = 1; i <= number; i++) {
            String res = "";
            int counter = 0;
            while (counter < i) {
                res = res + i;
                counter = counter + 1;
            }
            System.out.println(res);
        }
    }
}