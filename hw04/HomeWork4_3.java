import java.util.Scanner;

public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int v = sc.nextInt();
        String strresult = "";
        for (int i = 0; i < s.length(); i++) {
            char s = s.charAt(i);
            if ((a > i) | (i > v)){
                strresult += s;
            }
        }
        System.out.println(strresult);
    }
}
