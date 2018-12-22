import java.util.Scanner;

public class HomeWork6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] arr1 = new int[b];
        for (int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int c = 0;
        int d = 0;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                if (arr[i] == arr1[j])
                {
                    c++;
                }

            }
        }
        d = a + b - 2 * c;
        System.out.println(d);
    }
}

