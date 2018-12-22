import java.util.Scanner;



public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int sr = 0;
        int lsr = 0;
        int ir = 0;

        int scol = 0;
        int lscol = 0;
        int icol = 0;

        int a = 0;

        for (int j = 0; j < n; j++)
        {
            if (a == 0)
            {
                for (int i = 0; i < m; i++)
                {
                    scol += arr[i][j];
                    if (i == m - 1 && scol > lscol)
                    {
                        icol = j;
                        lscol = scol;
                    }
                }
            }

            sr += arr[a][j];
            if (j == n - 1 && sr > lsr)
            {
                ir = a;
                lsr = sr;
                sr = 0;
                a++;
                j = -1;
            }
            scol = 0;
            if (a - 1 == m - 1) j = n;
        }

        System.out.println("Строка:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[ir][j] + " ");
        }

        System.out.println();

        System.out.println("Столбец:");
        for (int i = 0; i < m; i++) {
            System.out.println(arr[i][icol]);
        }
    }
}