import java.util.Scanner;

public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = sc.nextLine();
        String space = "";
        System.out.println("Введите любое положительое число.");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char a = string.charAt(string.length() - 1);
            space += a;
            for (int j = 0; j < string.length() - 1; j++) {
                char w = string.charAt(j);
                space += w;
            }
            string = space;
            space = "";
        }
        System.out.println(string);
    }
}
