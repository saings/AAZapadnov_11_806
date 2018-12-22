import java.util.Scanner;

public class HomeWork5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String string = "n";
        while (1 == 1)
        {
            if (string.equals("n"))
            {
                System.out.println("Введите число n");
                n = ++n;
                double result = 0;
                System.out.println("введите первое число");
                double t = sc.nextDouble();
                System.out.println("Bведите оператор");
                String o = sc.next();
                System.out.println("Bведите второе число");
                double b = sc.nextDouble();
                n = ++n;
                if (o.equals("+")) {
                    result = t + b;
                }
                else if (o.equals("-"))
                    result = t - b;
                else if (o.equals("/"))
                    result = t / b;
                else if (o.equals("*"))
                    result = t * b;
                System.out.println(result);
            }
            System.out.println("Сбросить?");
            string = sc.next();
        }
        else if ("y".equals(string))
        {
            n = 1;
            string = "n";
        }
    }
}
