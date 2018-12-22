import java.util.Scanner;

public class HomeWork5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строчку.");
        String q = sc.nextLine();
        System.out.println("i или u");
        String w = sc.nextLine();
        if (w.equals("i")) {
            q = q.toLowerCase();
        }
        else if (w.equals("u")) {
            q = q.toUpperCase();
        }
        System.out.println(q);
    }
}
