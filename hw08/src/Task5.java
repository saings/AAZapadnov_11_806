import java.util.Scanner;


public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int[][] matrixa = new int[a1][a2];
        int[][] matrixb = new int[b1][b2];
        int[][] newmatrix = new int[a1][b2];

        for (int i = 0; i < a1; i++)
        {
            for (int j = 0; j < a2; j++)
            {
                matrixa[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < b1; i++)
        {
            for (int j = 0; j < b2; j++)
            {
                matrixb[i][j] = sc.nextInt();
            }
        }

        int mltpl = 0;
        int count = 0;
        int off = 0;
        for (int i = 0; i < a1; i++)
        {
            for (int j = 0; j < a2; j++)
            {
                mltpl += matrixa[i][j] * matrixb[j][off];
                if (count == b1 - 1 && off != b2)
                {
                    newmatrix[i][off] = mltpl;
                    j = -1;
                    mltpl = 0;
                    count = 0;
                    off += 1;
                } else
                    {
                    count += 1;
                }
                if (off == b2)
                {
                    j = a2;
                    off = 0;
                }
            }
        }

        for (int i = 0; i < a1; i++)
        {
            for (int j = 0; j < b2; j++)
            {
                System.out.print(newmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}