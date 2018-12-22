import java.util.Scanner;



public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int count = 1;
        int a = 0;
        int ring = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int r = 0; r < ring; r++)
        {
            for (int i = a; i < 1 + a; i++)
            {
                for (int j = a; j < n - a; j++)
                {
                    matrix[i][j] = count;
                    count++;
                }
            }


            for (int i = 1 + a; i < n - a; i++)
            {
                for (int j = n - 1 - a; j < n - a; j++)
                {
                    matrix[i][j] = count;
                    count++;
                }
            }

            for (int i = n - 1 - a; i < n - a; i++)
            {
                for (int j = n - 2 - a; j >= a; j--)
                {
                    matrix[i][j] = count;
                    count++;
                }
            }

            for (int i = n - 2 - a; i > a; i--)
            {
                for (int j = a; j < 1 + a; j++)
                {
                    matrix[i][j] = count;
                    count++;
                }
            }
            a++;
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}