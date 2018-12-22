import java.util.Scanner;

public class HomeWork5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        char[] e = b.toCharArray();
        int a = 0;
        int c = 1;
        for (int i = e.length - 1; i >= 0; i--) {
            int n = Character.digit(e[i], 10);
            while (n > 0) {
                a += n % 10 * c;
                n /= 10;
                c *= 10;
            }

        }
        System.out.println(a);
    }
}
