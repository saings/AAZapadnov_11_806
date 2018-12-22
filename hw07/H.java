public class H {

//    H: Проверка числа на простоту
//    Дано натуральное число n>1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
//    если число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn).

    public static boolean aBoolean = true;

    public static void main(String[] args) {
        int n = 7;
        if (task(2, n)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean task(int i, int n) {
        if (n > 1) {
            if (i < n / 2)
            {
                if (n % i == 0)
                {
                    aBoolean = false;
                } else
                    {
                    task(i += 1, n);
                }
            }
            return aBoolean;
        }
        return false;
    }
}
