import java.util.Scanner;



public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int dm = 0;
        int db = 0;
        int sr = 0;
        int lsr = -1;

        int scol = 0;
        int lscol = -1;

        boolean ismagic = true;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sr += arr[i][j];
                scol += arr[j][i];
                if (i == n - j - 1) dm += arr[i][j];
                if (i == j) db += arr[i][j];
            }

            if ((lsr != -1 && sr != lsr) || lscol != -1 && scol != lscol)
            {
                ismagic = false;
            }
            lsr = sr;
            lscol = scol;

            sr = 0;
            scol = 0;
        }

        if (dm != db)
        {
            ismagic = false;
        }

        System.out.println(ismagic);
    }
}