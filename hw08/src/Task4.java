import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] min = new int[n];
        for (int i = 0; i < n; i++)
        {
            min[i] = arr[i][0];
            for (int j = 0; j < m; j++)
            {
                if (arr[i][j] < min[i])
                {
                    min[i] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (arr[i][j] == min[i])
                {
                    boolean isMax = true;
                    for (int k = 0; k < n; k++)
                    {
                        if (arr[k][j] > min[i])
                        {
                            isMax = false;
                        }
                        if (k == n - 1 && isMax) {
                            System.out.println(arr[i][j]);
                        }
                    }
                }
            }
        }
    }
}